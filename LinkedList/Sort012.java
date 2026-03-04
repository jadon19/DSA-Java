package LinkedList;

public class Sort012 {
    static boolean flag_0 = false;
    static boolean flag_1 = false;
    static boolean flag_2 = false;
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(0);
        ListNode n5 = new ListNode(2);
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
        head = sortLinkedList(head);
        ReverseDoublyLinkedList.printDLL(head);
    }
    static ListNode sortLinkedList(ListNode head){

    ListNode zeroD = new ListNode(-1);
    ListNode oneD  = new ListNode(-1);
    ListNode twoD  = new ListNode(-1);

    ListNode z = zeroD, o = oneD, t = twoD;

    ListNode curr = head;

    while(curr != null){
        if(curr.data == 0){
            z.next = curr;
            curr.prev = z;
            z = z.next;
        }
        else if(curr.data == 1){
            o.next = curr;
            curr.prev = o;
            o = o.next;
        }
        else{
            t.next = curr;
            curr.prev = t;
            t = t.next;
        }
        curr = curr.next;
    }

    // connect lists
    z.next = (oneD.next != null) ? oneD.next : twoD.next;
    if(z.next != null) z.next.prev = z;

    o.next = twoD.next;
    if(twoD.next != null) twoD.next.prev = o;

    head = zeroD.next;
    if(head != null) head.prev = null;

    return head;
}
}
