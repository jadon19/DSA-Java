package LinkedList;

public class SortLinkedList {
    public Node sortList(Node head) {
        if (head == null || head.next == null) return head;

        // split list
        Node mid = getMid(head);
        Node right = mid.next;
        mid.next = null;

        // sort halves
        Node leftSorted = sortList(head);
        Node rightSorted = sortList(right);

        // merge
        return merge(leftSorted, rightSorted);
    }

    private Node getMid(Node head) {
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }
    
}
