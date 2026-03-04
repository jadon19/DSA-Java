package LinkedList;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Dummy node to simplify result list handling
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current.next.prev = current;  
            current = current.next;
        }

        
        if (dummy.next != null) {
            dummy.next.prev = null;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {

        // Number 342 → 2 -> 4 -> 3
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.prev = l1;
        l1.next.next = new ListNode(3);
        l1.next.next.prev = l1.next;

        // Number 465 → 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.prev = l2;
        l2.next.next = new ListNode(4);
        l2.next.next.prev = l2.next;

        ListNode result = addTwoNumbers(l1, l2);

        System.out.print("Result: ");
        printList(result);
    }
}
