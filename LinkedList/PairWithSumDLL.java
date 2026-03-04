package LinkedList;
class NodeDLL {
    int data;
    NodeDLL next;
    NodeDLL prev;

    NodeDLL(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class PairWithSumDLL {

    static void findPairs(NodeDLL head, int k){

        if(head == null) return;

        NodeDLL left = head;
        NodeDLL right = head;

        // move right to last node
        while(right.next != null){
            right = right.next;
        }

        /*
        two pointer approach
        */

        while(left != right && right.next != left){

            int sum = left.data + right.data;

            if(sum == k){
                System.out.println(left.data + " , " + right.data);

                left = left.next;
                right = right.prev;
            }

            else if(sum < k){
                left = left.next;
            }

            else{
                right = right.prev;
            }
        }
    }
}