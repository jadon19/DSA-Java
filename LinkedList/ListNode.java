package LinkedList;
public class ListNode{
    int data;
    ListNode next;
    ListNode prev;
    ListNode(int data){
        this.data = data;
    }
    ListNode(int data , ListNode prev, ListNode next){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }

}