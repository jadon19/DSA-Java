package LinkedList;

public class ReverseInKBatch {

    public static ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k <= 1) return head;

        ListNode current = head;
        ListNode newHead = null;
        ListNode groupPrevTail = null;

        while (current != null) {

            ListNode groupHead = current;
            int count = 0;

            // Check if k nodes exist
            while (current != null && count < k) {
                current = current.next;
                count++;
            }

            if (count < k) break; // not enough nodes

            // Reverse k nodes
            ListNode reversedHead = reverseBlock(groupHead, k);

            if (newHead == null) {
                newHead = reversedHead;
            }

            if (groupPrevTail != null) {
                groupPrevTail.next = reversedHead;
                reversedHead.prev = groupPrevTail;
            }

            groupPrevTail = groupHead;  // after reverse, old head becomes tail
        }

        return newHead != null ? newHead : head;
    }

    private static ListNode reverseBlock(ListNode head, int k) {

        ListNode current = head;
        ListNode prev = null;
        int count = 0;

        while (current != null && count < k) {

            ListNode next = current.next;

            current.next = prev;
            current.prev = next;

            prev = current;
            current = next;

            count++;
        }

        head.next = current;
        if (current != null) current.prev = head;

        return prev;
    }
}
