package LinkedList;

public class DeleteDuplicate {
    // given array is sorted in non decreasing order
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(6);
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
        ReverseDoublyLinkedList.printDLL(head);

        System.out.print("Removed duplicated from Linked List: ");
        head = removeNode(head);
        ReverseDoublyLinkedList.printDLL(head);


    }
    static ListNode removeNode(ListNode head){
    if(head == null) return null;

    ListNode cur1 = head;
    ListNode cur2 = head.next;

    while(cur2 != null){

        if(cur2.data == cur1.data){
            
            cur1.next = cur2.next;

            if(cur2.next != null){
                cur2.next.prev = cur1;
            }

            cur2 = cur1.next;  
        }
        else{
            cur1 = cur2;        
            cur2 = cur2.next;
        }
    }
    return head;
}
}
