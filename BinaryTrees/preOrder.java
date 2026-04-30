package BinaryTrees;
import java.util.*;

public class PreOrder {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, null, 4, 5, 6};
        TreeNode root = TreeTraversal.generateTree(arr);
        List<Integer> result = new ArrayList<>();
        List<Integer> preOrderArr1 = preOrderRecursion(root,result);
        for(Integer i : preOrderArr1) System.out.println(i);
        preOrderStack(root);


    }
    public static List<Integer> preOrderRecursion(TreeNode node,List<Integer> result){
        if(node==null){
            return result;
        }
        result.add(node.data);
        preOrderRecursion(node.left, result);
        preOrderRecursion(node.right, result);
        return result;
        }
        
    public static void preOrderStack(TreeNode node){
        List<TreeNode> stackResult = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            TreeNode element = stack.pop();
            stackResult.add(element);
            if(element.right!=null) stack.push(element.right);
            if(element.left!=null) stack.push(element.left);
        }
        for(TreeNode i : stackResult) System.out.println(i.data);
    }
}
