package LinkedList;

public class StartingPointOfLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(50);
        Node n5 = new Node(60);
        head.next=n1;
        n1.next = n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next= n3;
        Node node = startingPoint(head);
        System.out.println(node.data);
        lengthOfCycle(head);
    }
    static Node startingPoint(Node head){
        Node fast =head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow=slow.next;
            if(fast == slow){
                slow=head;
                while(fast!=slow){
                    fast = fast.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }
    static void lengthOfCycle(Node head){
        Node fast =head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow=slow.next;
            if(fast == slow){
                int counter = 1;
                Node temp = slow.next;
                while(temp!=slow){
                    
                    temp=temp.next;
                    counter++;

                }
                System.out.println("Length of cycle is: "+counter);
                return;
            }
        }
    }

}
