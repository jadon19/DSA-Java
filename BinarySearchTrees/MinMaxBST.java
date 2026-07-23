package BinarySearchTrees;

import BinaryTrees.TreeNode;

public class MinMaxBST {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        System.out.println("Min: " + findMin(root).data);
        System.out.println("Max: " + findMax(root).data);

    }

    public static TreeNode findMin(TreeNode root) {
        if (root == null)
            return null;

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static TreeNode findMax(TreeNode root) {
        if (root == null)
            return null;

        while (root.right != null) {
            root = root.right;
        }

        return root;
    }

    public static TreeNode findMinRecursive(TreeNode root) {
        if (root == null || root.left == null) {
            return root;
        }

        return findMinRecursive(root.left);
    }

    public static TreeNode findMaxRecursive(TreeNode root) {
        if (root == null || root.right == null) {
            return root;
        }

        return findMaxRecursive(root.right);
    }
}
