package LinkedList;
import java.util.HashMap;
public class DetectLoop {
    public static void main(String[] args){
        Node head = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(50);
        Node n5 = new Node(60);
        head.next=n1;
        n1.next = n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next= n3;

        // boolean flag = detectLoop(head);
        boolean flag = detectLoopFloyd(head);
        if(flag==true){
            System.out.println("Cycle detected");
        }
        else{
            System.out.println("Cycle Not detected");
        }

    }
    static boolean detectLoop(Node head){
        HashMap <Node, Integer> map = new HashMap<>();
        Node cur = head;
        while(cur!=null){

            if(map.containsKey(cur)){
                return true;
            }
            map.put(cur,1);
            cur=cur.next;
        }
        return false;
    }
    static boolean detectLoopFloyd(Node head){
        Node fast =head;
        Node slow = head;
        while(fast!=null &&fast.next!=null){
            fast = fast.next.next;
            slow=slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
