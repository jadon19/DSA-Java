package BinaryTrees;

public class MaximumPathSum {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;

        // Ignore negative paths
        int left = Math.max(0, dfs(node.left));
        int right = Math.max(0, dfs(node.right));

        // Path passing through current node
        int currentPath = node.data + left + right;

        // Update global max
        maxSum = Math.max(maxSum, currentPath);

        // Return max single path (for parent)
        return node.data + Math.max(left, right);
    }
}
