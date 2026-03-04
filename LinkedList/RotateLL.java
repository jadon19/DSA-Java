package LinkedList;

public class RotateLL {

    static Node rotateRight(Node head, int k){

        if(head == null || head.next == null || k == 0)
            return head;

        Node cur = head;
        int length = 1;

        /*
        find length of linked list
        */

        while(cur.next != null){
            cur = cur.next;
            length++;
        }

        /*
        reduce unnecessary rotations
        */

        k = k % length;

        if(k == 0)
            return head;

        /*
        cur currently at last node
        make list circular
        */

        cur.next = head;

        /*
        new tail position
        length - k - 1
        */

        Node newTail = head;

        for(int i = 0; i < length - k - 1; i++){
            newTail = newTail.next;
        }

        /*
        new head will be next node
        */

        Node newHead = newTail.next;

        /*
        break circular link
        */

        newTail.next = null;

        return newHead;
    }

    // helper to insert node at end
    static Node insert(Node head, int val){

        Node newNode = new Node(val);

        if(head == null)
            return newNode;

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    // helper to print list
    static void printList(Node head){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = null;

        head = insert(head,1);
        head = insert(head,2);
        head = insert(head,3);
        head = insert(head,4);
        head = insert(head,5);

        System.out.println("Original List:");
        printList(head);

        int k = 2;

        head = rotateRight(head, k);

        System.out.println("Rotated List:");
        printList(head);
    }
}
