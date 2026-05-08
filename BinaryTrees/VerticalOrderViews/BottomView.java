package BinaryTrees.VerticalOrderViews;


import java.util.*;
import BinaryTrees.TreeNode;

class Pair2 {
	TreeNode node;
	int hd;

	Pair2(TreeNode node, int hd) {
		this.node = node;
		this.hd = hd;
	}
}

public class BottomView {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);

		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		bottomView(root);
	}

	public static void bottomView(TreeNode root) {

		Queue<Pair2> q = new LinkedList<>();
		TreeMap<Integer, Integer> map = new TreeMap<>();

		q.offer(new Pair2(root, 0));

		while (!q.isEmpty()) {

			Pair2 p = q.poll();

			map.put(p.hd, p.node.data);

			if (p.node.left != null) {
				q.offer(new Pair2(p.node.left, p.hd - 1));
			}

			if (p.node.right != null) {
				q.offer(new Pair2(p.node.right, p.hd + 1));
			}
		}

		for (int val : map.values()) {
			System.out.print(val + " ");
		}
	}
}
