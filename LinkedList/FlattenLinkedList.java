package LinkedList;

class NodeListTwo {
    int data;
    NodeListTwo next;
    NodeListTwo child;

    NodeListTwo(int data) {
        this.data = data;
        this.next = null;
        this.child = null;
    }
}

public class FlattenLinkedList {

    static NodeListTwo flatten(NodeListTwo head) {

        if (head == null || head.next == null)
            return head;

        head.next = flatten(head.next);

        head = merge(head, head.next);

        return head;
    }

    static NodeListTwo merge(NodeListTwo a, NodeListTwo b) {

        NodeListTwo dummy = new NodeListTwo(-1);
        NodeListTwo temp = dummy;

        while (a != null && b != null) {

            if (a.data < b.data) {
                temp.child = a;
                a = a.child;
            } else {
                temp.child = b;
                b = b.child;
            }

            temp = temp.child;
            temp.next = null;
        }

        if (a != null)
            temp.child = a;
        else
            temp.child = b;

        return dummy.child;
    }

    static void printList(NodeListTwo head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.child;
        }
    }

    public static void main(String[] args) {

        NodeListTwo head = new NodeListTwo(5);
        head.child = new NodeListTwo(7);
        head.child.child = new NodeListTwo(8);
        head.child.child.child = new NodeListTwo(30);

        head.next = new NodeListTwo(10);
        head.next.child = new NodeListTwo(20);

        head.next.next = new NodeListTwo(19);
        head.next.next.child = new NodeListTwo(22);
        head.next.next.child.child = new NodeListTwo(50);

        head.next.next.next = new NodeListTwo(28);
        head.next.next.next.child = new NodeListTwo(35);
        head.next.next.next.child.child = new NodeListTwo(40);
        head.next.next.next.child.child.child = new NodeListTwo(45);

        NodeListTwo result = flatten(head);

        printList(result);
    }
}
// optimal solution using priority queue (done later)