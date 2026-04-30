package BinaryTrees;
import java.util.*;
public class PostOrder {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, null, 4, 5, 6};
        TreeNode root = TreeTraversal.generateTree(arr);
        // List<Integer> result = new ArrayList<>();
        // List<Integer> postOrderArr1 = postOrderRecursion(root,result);
        // for(Integer i : postOrderArr1) System.out.println(i);
        postOrderStack(root);


    }
    public static List<Integer> postOrderRecursion(TreeNode node,List<Integer> result){
        if(node==null){
            return result;
        }
        
        postOrderRecursion(node.left, result);
        postOrderRecursion(node.right, result);
        result.add(node.data);
        return result;
        }
        
    public static void postOrderStack(TreeNode node){
        List<TreeNode> stackResult = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(node);
        while(!s1.isEmpty()){
            TreeNode ele = s1.pop();
            s2.push(ele);
            if(ele.left!=null) s1.push(ele.left);
            if(ele.right!=null)s1.push(ele.right);
        }
        while(!s2.isEmpty()){
            stackResult.add(s2.pop());
        }

        for(TreeNode i : stackResult) System.out.println(i.data);
    }
}
