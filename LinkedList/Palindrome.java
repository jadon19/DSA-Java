package LinkedList;

public class Palindrome {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(3);
        Node n4 = new Node(2);
        Node n5 = new Node(1);
        head.next=n1;
        n1.next = n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        System.out.print("Original Linked List: ");
        CreateLinkedList.printList(head);
        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;  
        }

        // Reverse the second half
        Node newHead = ReverseLinkedList.recursionReverse(slow.next);

        
        Node first = head;
        Node second = newHead;
        while (second != null) {
            if (first.data != second.data) {
                ReverseLinkedList.recursionReverse(newHead);
                return false;
            }

            first = first.next;
            second = second.next;
        }

        ReverseLinkedList.recursionReverse(newHead);

        return true;
    }
    
}
