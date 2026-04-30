package BinaryTrees;
import java.util.*;

public class InOrder {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, null, 4, 5, 6};
        TreeNode root = TreeTraversal.generateTree(arr);
        inOrderStack(root);

    }
    public static List<Integer> inOrderRecursion(TreeNode node,List<Integer> result){
        if(node==null){
            return result;
        }
        
        inOrderRecursion(node.left, result);
        result.add(node.data);
        inOrderRecursion(node.right, result);
        return result;
        }
        
    public static void inOrderStack(TreeNode node){
        List<TreeNode> stackResult = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty()||node!=null){
            while(node!=null){
                stack.push(node);
                node= node.left;
            }
            TreeNode ele = stack.pop();
            stackResult.add(ele);
            node =ele.right;
        }
        
        for(TreeNode i : stackResult) System.out.println(i.data);
    }
}
