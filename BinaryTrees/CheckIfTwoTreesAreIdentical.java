package BinaryTrees;

public class CheckIfTwoTreesAreIdentical {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Both null → identical
        if (p == null && q == null) return true;

        // One null or values differ → not identical
        if (p == null || q == null || p.data != q.data) return false;

        // Check left and right subtrees
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}
