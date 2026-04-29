package BinaryTrees;
class Node {
    int data;
    Node left;
    Node right;
    public Node(int key){
        this.data = key;
        this.left=null;
        this.right=null;
    }
    
}

public class CreateBinaryTree {
    public static void main(String[] args) {
        // Node root = createBinaryTree();



    }
    public static Node createBinaryTree(){
        Node root = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);
        Node n6 = new Node(7);
        root.left = n1;
        root.right=n2;
        n1.left=n3;
        n1.right=n4;
        n2.left=n5;
        n5.right=n6;
        return root;
    }
}
