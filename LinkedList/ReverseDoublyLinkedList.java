package LinkedList;

public class ReverseDoublyLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        ListNode n1 = new ListNode(7);
        ListNode n2 = new ListNode(8);
        ListNode n3 = new ListNode(9);
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(6);
        head.next=n1;

        n1.next = n2;
        n1.prev = head;

        n2.next=n3;
        n2.prev = n1;

        n3.next=n4;
        n3.prev = n2;

        n4.next=n5;
        n4.prev = n3;

        n5.prev = n4;
        System.out.print("Original Linked List: ");

        //Method in class is static, so we do not create an object of this class to access it
        printDLL(head);

        head = reverseDoubly(head);
        printDLL(head);
        
    }
    static ListNode reverseDoubly(ListNode head){
        ListNode cur=head;
        ListNode temp;
        while(cur!=null){
            head= cur;
            temp = cur.next;
            cur.next = cur.prev;
            cur.prev = temp;
            cur = cur.prev;
        }
        return head;
    }
    static void printDLL(ListNode head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }
}