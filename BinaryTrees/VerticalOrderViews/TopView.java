package BinaryTrees.VerticalOrderViews;

import java.util.*;
import BinaryTrees.TreeNode;

class Pair {
	TreeNode node;
	int hd;

	Pair(TreeNode node, int hd) {
		this.node = node;
		this.hd = hd;
	}
}

public class TopView {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);

		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		topView(root);
	}

	public static void topView(TreeNode root) {

		Queue<Pair> q = new LinkedList<>();
		TreeMap<Integer, Integer> map = new TreeMap<>();

		q.offer(new Pair(root, 0));

		while (!q.isEmpty()) {

			Pair p = q.poll();

			if (!map.containsKey(p.hd)) {
				map.put(p.hd, p.node.data);
			}

			if (p.node.left != null) {
				q.offer(new Pair(p.node.left, p.hd - 1));
			}

			if (p.node.right != null) {
				q.offer(new Pair(p.node.right, p.hd + 1));
			}
		}

		for (int val : map.values()) {
			System.out.print(val + " ");
		}
	}
}
