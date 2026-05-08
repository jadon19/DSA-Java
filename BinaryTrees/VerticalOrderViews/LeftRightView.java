package BinaryTrees.VerticalOrderViews;

import java.util.*;
import BinaryTrees.TreeNode;

public class LeftRightView {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);

		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		leftView(root);

		System.out.println();

		rightView(root);
	}

	public static void leftView(TreeNode root) {

		Queue<TreeNode> q = new LinkedList<>();

		q.offer(root);

		while (!q.isEmpty()) {

			int size = q.size();

			for (int i = 0; i < size; i++) {

				TreeNode cur = q.poll();

				if (i == 0) {
					System.out.print(cur.data + " ");
				}

				if (cur.left != null) {
					q.offer(cur.left);
				}

				if (cur.right != null) {
					q.offer(cur.right);
				}
			}
		}
	}

	public static void rightView(TreeNode root) {

		Queue<TreeNode> q = new LinkedList<>();

		q.offer(root);

		while (!q.isEmpty()) {

			int size = q.size();

			for (int i = 0; i < size; i++) {

				TreeNode cur = q.poll();

				if (i == size - 1) {
					System.out.print(cur.data + " ");
				}

				if (cur.left != null) {
					q.offer(cur.left);
				}

				if (cur.right != null) {
					q.offer(cur.right);
				}
			}
		}
	}
}