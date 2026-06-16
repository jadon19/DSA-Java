package BinaryTrees.LeetcodeHard;

import java.util.LinkedList;

import BinaryTrees.TreeNode;
public class PathFromRootToLeaf {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        int targetValue = 7;
        LinkedList<Integer> result = new LinkedList<>();
        recursion(root, result, targetValue);
        System.out.println(result);

    }
    public static boolean recursion(TreeNode node,LinkedList<Integer> result,int x){
        if(node==null) return false;
        
        result.add(node.data);

        if(node.data==x) return true;

        if(recursion(node.left, result, x)||recursion(node.right, result, x)) return true;
        result.removeLast();
        return false;
    }
}
