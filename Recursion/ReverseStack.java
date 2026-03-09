package Recursion;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        reverse(stack);

        System.out.println(stack);
    }
    static void reverse(Stack <Integer> stack){
        int temp;
        if(!stack.isEmpty()){
            temp  = stack.pop();
            reverse(stack);
            insert(temp,stack);
        }
        
    }
    static void insert(int temp, Stack <Integer> stack){
        int val;
        if(stack.isEmpty()){
            stack.push(temp);
            return;
        }
        val = stack.pop();
        insert(temp,stack);
        stack.push(val);
    }
}
