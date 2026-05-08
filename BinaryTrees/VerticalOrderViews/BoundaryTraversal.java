package BinaryTrees.VerticalOrderViews;
import java.util.ArrayList;
import java.util.List;
import BinaryTrees.TreeNode;
public class BoundaryTraversal{
    static List<Integer>boundaryNodes=new ArrayList<>();
    static List<Integer>leftBoundaryNodes=new ArrayList<>();
    static List<Integer>rightBoundaryNodes=new ArrayList<>();
    public static void main(String[]args){
            TreeNode node=new TreeNode(45);
            leftBoundary(node.left);
            rightBoundary(node.right);
    }
    public static void leftBoundary(TreeNode node){
        if(node==null)return;
        if(node.left==null&&node.right==null)return;
        leftBoundaryNodes.add(node.data);
        if(node.left!=null){
            leftBoundary(node.left);
        }
        else{
            leftBoundary(node.right);
        }
    }
    public static void rightBoundary(TreeNode node){
        if(node==null)return;
        if(node.left==null&&node.right==null)return;
        rightBoundaryNodes.add(node.data);
        if(node.right!=null){
            rightBoundary(node.right);
        }
        else{
            rightBoundary(node.left);
        }
    }
}