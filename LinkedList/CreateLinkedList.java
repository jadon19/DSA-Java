package LinkedList;
public class CreateLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);

        //adding nodes at end


        addNode(20,head);
        addNode(30,head);
        printList(head);

        //adding nodes at start
        head = addNodeAtStart(head);
        printList(head);

        //delete node at end
        deleteNodeAtEnd(head);
        printList(head);

        //delete head
        head = deleteHead(head);
        printList(head);

        //search a given node with value
        searchNode(head, 20);

        System.out.println("Adding some vlaues to list");
        addNode(50,head);
        addNode(30,head);
        printList(head);

        //inserting a node in list
        insertNode(head, 2, new Node(60));
        printList(head);
        
    }
    
    static void addNode(int data,Node head){
        Node n = new Node(data);
        Node cur = head;
        while(cur.next !=null){
            cur=cur.next;
        }
        cur.next = n;
    }
    
    static Node addNodeAtStart(Node head){
        Node n = new Node(40,head);
        head = n;
        return head;
    }

    static void deleteNodeAtEnd(Node head){
        Node cur  = head;

    
        if (cur==null){
            return;
        }
        if(cur.next==null){
            head=null;
            return;
        }
        while(cur.next.next !=null){
            cur = cur.next;
        }
        cur.next=null;
    }
    static Node deleteHead(Node head){
        if(head==null){
            return head;
        }
        if(head.next==null){
            head=null;
            return head;
        }
        Node cur = head;
        head = cur.next;
        cur = null;
        return head;
    }
    
    static void searchNode(Node head,int val){
        Node cur = head;
        int i=0;
        while(cur !=null){
            if(cur.data==val){
                System.out.println("found : "+val+ " at index : " +i);
            }
            cur=cur.next;
            i+=1;
        }
    }

    static void insertNode(Node head,int index, Node node){
        Node cur = head;
        int lft = 0;
        while(lft<index-1){
            cur=cur.next;
            lft+=1;
        }
        node.next = cur.next;
        cur.next = node;
    }
    
    static void printList(Node head){
        Node cur = head;
        //int count = 0;
        while(cur !=null){
            System.out.print(cur.data+"\t");
            cur=cur.next;
            //count+=1;
        }
        //System.out.println("count : "+count);
        System.out.println("");
    }
}


//1. Delete a given node without head