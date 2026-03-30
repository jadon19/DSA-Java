package Stacks;
class ArrayStack{
    private int size;
    private int top;
    private int[] stack;
    public ArrayStack(int size){
        this.size = size;
        top = -1;
        stack = new int[size];
    }
    public int top(){
        if(isEmpty()){
            return -1;
        }
        return stack[top];
    }
    public void push(int x){
        if(top==size-1){
            System.out.println("Stack OverFlow");
            return;
        }
        top+=1;
        stack[top] = x;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("StackUnderFlow");
            return;
        }
        System.out.println("Popped element" + stack[top]);
        top--;
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    public void display(){
        for(int i =0 ;i<=top;i++){
            System.out.println(stack[i]);
        }
    }
}
public class Stack{
    public static void main(String[] args) {
        ArrayStack mystack = new ArrayStack(5);
        mystack.top();
        mystack.push(5);
        mystack.push(6);
        mystack.push(8);
        mystack.push(2);
        mystack.push(1);
        mystack.display();
        mystack.pop();
        mystack.isEmpty();
        mystack.display();
        
    }
}