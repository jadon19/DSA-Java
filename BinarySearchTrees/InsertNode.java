package BinarySearchTrees;

import BinaryTrees.TreeNode;
public class InsertNode {
    public static void main(String[] args) {
        
    }
    public static TreeNode insert(TreeNode root, int val) {
    if (root == null) {
        return new TreeNode(val);
    }

    TreeNode curr = root;

    while (true) {
        if (val < curr.data) {
            if (curr.left == null) {
                curr.left = new TreeNode(val);
                break;
            }
            curr = curr.left;
        } else {
            if (curr.right == null) {
                curr.right = new TreeNode(val);
                break;
            }
            curr = curr.right;
        }
    }

    return root;
}
}
