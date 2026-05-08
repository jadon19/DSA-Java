package BinaryTrees.VerticalOrderViews;

import BinaryTrees.TreeNode;

public class SymmetricTree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);

		root.left = new TreeNode(2);
		root.right = new TreeNode(2);

		root.left.left = new TreeNode(3);
		root.right.right = new TreeNode(3);

		System.out.println(isSymmetric(root.left, root.right));
	}

	public static boolean isSymmetric(TreeNode left, TreeNode right) {

		if (left == null && right == null) {
			return true;
		}

		if (left == null || right == null) {
			return false;
		}

		if (left.data != right.data) {
			return false;
		}

		return isSymmetric(left.left, right.right)
				&& isSymmetric(left.right, right.left);
	}
}
