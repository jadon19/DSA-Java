package LinkedList;
class ListNode{
    int data;
    ListNode next;
    ListNode prev;
    ListNode(int data){
        this.data = data;
    }
    ListNode(int data , ListNode prev, ListNode next){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }

}
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

        //Method in class is not static, so we have to create an object of this class and then access it
        ReverseDoublyLinkedList obj = new ReverseDoublyLinkedList();
        obj.printDLL(head);

        head = reverseDoubly(head);
        obj.printDLL(head);
        
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
    public void printDLL(ListNode head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }
}