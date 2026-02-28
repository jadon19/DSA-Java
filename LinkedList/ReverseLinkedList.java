package LinkedList;

import java.util.Stack;

public class ReverseLinkedList {
    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        
        CreateLinkedList.printList(head);
        // head= stackReverse(head);
        head = pointerReverse(head);
        CreateLinkedList.printList(head);
        
    }
    static Node stackReverse(Node head){
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while(temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            temp.data = stack.pop();
            temp=temp.next;
        }
        return head;
    }
    static Node pointerReverse(Node head){
        if(head.next==null){
            return head;
        }
        Node f = head.next;
        Node r = head;
        Node t;
        head.next=null;
        while(f!=null){
            t = f.next;
            f.next=r;
            r=f;
            f=t;
        }
        head=r;
        return head;
    }
    static Node recursionReverse(Node head){
         if (head == null || head.next == null)
            return head;

        // Recursively reverse the rest of the list
        Node newHead = recursionReverse(head.next);

        // Store reference to next node
        Node front = head.next;

        // Make the next node point to current node
        front.next = head;

        // Break original forward link
        head.next = null;

        // Return new head of reversed list
        return newHead;
    }

}
