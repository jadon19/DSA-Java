package BinaryTrees;

import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int key){
        this.data = key;
        this.left=null;
        this.right=null;
    }
    
}
class Pair{
    TreeNode node;
    int state;
    public Pair(TreeNode node, int state){
        this.node = node;
        this.state=state;
    }
}
public class TreeTraversal {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, null, 4, 5, 6};
        TreeNode root = generateTree(arr);
        traversals(root);

    }

    public static void traversals(TreeNode root) {
        List<Integer> preOrder = new ArrayList<>();
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> postOrder = new ArrayList<>();


       Deque<Pair> stack = new ArrayDeque<Pair>();
        stack.push(new Pair(root, 1));
        while(!stack.isEmpty()){
            Pair element = stack.pop();
            int state = element.state;
            if(state == 1){
                preOrder.add(element.node.data);
                element.state +=1;
                stack.push(element);
                if(element.node.left!=null){
                    stack.push(new Pair(element.node.left, 1));
                }
            }
            else if(state == 2){
                inOrder.add(element.node.data);
                element.state +=1;
                stack.push(element);
                if(element.node.right!=null){
                    stack.push(new Pair(element.node.right, 1));
                }
            }
            else {
                postOrder.add(element.node.data);
            }
        }
        System.out.println("Preorder: " + preOrder);
        System.out.println("Inorder: " + inOrder);
        System.out.println("Postorder: " + postOrder);
    }
     public static TreeNode generateTree(Integer[] arr) {
        if (arr.length == 0 || arr[0] == null) return null;
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;

        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();
            if (i < arr.length && arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.add(current.left);
            }
            i++;

            // Right child
            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }
}
