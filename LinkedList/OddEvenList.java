package LinkedList;

public class OddEvenList {
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
        head = oddEvenList(head);
        CreateLinkedList.printList(head);
    }
    public static Node oddEvenList(Node head) {
        if (head == null || head.next == null) return head;

        Node odd = head; 
        Node even = head.next;  
        Node evenHead = even;    

        while (even != null && even.next != null) {
            odd.next = even.next;   
            odd = odd.next;

            even.next = odd.next;  
            even = even.next;
        }

        odd.next = evenHead;      
        return head;
    }
}
