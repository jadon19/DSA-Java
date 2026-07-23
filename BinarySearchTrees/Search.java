package BinarySearchTrees;

import BinaryTrees.TreeNode;

public class Search {
    public static void main(String[] args) {

    TreeNode root1 = new TreeNode(4);
    root1.left = new TreeNode(2);
    root1.right = new TreeNode(7);
    root1.left.left = new TreeNode(1);
    root1.left.right = new TreeNode(3);

    TreeNode result1 = search(root1, 2);
    TreeNode result2 = searchIterative(root1, 2);
    System.out.println(result1.data);
    System.out.println(result2.data);
    // Expected Output: 2



    }
    public static TreeNode search(TreeNode node,int val){
            if(node.data==val) return node;
            if(node.left!=null && val<node.data) return search(node.left,val);
            if(node.right!=null && val>node.data) return search(node.right,val);
            return null;
    }
    public static TreeNode searchIterative(TreeNode node , int val){
        if(node==null) return node;
        while(node!=null){
            if(node.data==val) return node;
            if (val<node.data) {
                node = node.left;
            }
            else node=node.right;
        }
        return node;
    }
}
