package LinkedList;

public class DeleteMiddle {
    public Node deleteMiddle(Node head) {
        if(head.next==null){
            return null;
        }
        Node fast = head;
        Node slow = head;
        Node temp = head;
        while(fast!=null && fast.next!=null){
            temp = slow;
            slow=slow.next;
            fast= fast.next.next;
        }
        temp.next = slow.next;
        return head;
        
    }
}
