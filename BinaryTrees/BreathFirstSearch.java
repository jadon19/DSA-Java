package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class BreathFirstSearch {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, null, 4, 5, 6};
        TreeNode root = generateTree(arr);
        Queue<TreeNode> queue = new LinkedList<>();
        bfs(queue, root);
    }
    public static void bfs(Queue<TreeNode> buffer,TreeNode root){
        if(root==null){
            return;
        }
        int nodes = 0;
        int height = 0;
        buffer.offer(root);
        List<List<Integer>> result  = new ArrayList<>();
        while (!buffer.isEmpty()) {
            int size = buffer.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0 ;i<size;i++){
                TreeNode node = buffer.poll();
                nodes += 1;
                temp.add(node.data);
                System.out.println(node.data);
                if(node.left!=null) buffer.offer(node.left);
                if(node.right!=null) buffer.offer(node.right);
            }
            result.add(temp);
            height++;
            
            
        }
        System.out.println("Number of nodes : "+ nodes);
        System.out.println("Height : "+ height);
        System.out.println(result.toString());
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
