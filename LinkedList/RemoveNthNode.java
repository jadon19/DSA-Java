package LinkedList;

public class RemoveNthNode {
    public Node removeNthFromEnd(Node head, int n) {
        Node cur = head;
        int index = 0;
        int size = 0;
    
        while(cur!=null){
            cur=cur.next;
            size++;
        }
        if(n==size){
            return head.next;
        }
        cur = head;
        while(cur!=null && index<size - n-1){
            cur = cur.next;
            index++;
        }
        cur.next = cur.next.next;
        return head;
    }
    // better solution with single pass-> fast and slow pointers
}
