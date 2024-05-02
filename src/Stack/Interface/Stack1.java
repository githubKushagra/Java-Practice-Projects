package Stack.Interface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.*;

public class Stack1 {
    public static void main(String[] args) {
        // ArrayDeque (Recommended for stack operations)
        Deque<Integer> arrayDequeStack = new ArrayDeque<>();
        arrayDequeStack.push(1);
        arrayDequeStack.push(2);
        arrayDequeStack.push(3);
        System.out.println("ArrayDeque Stack: " + arrayDequeStack);
        arrayDequeStack.pop();
        System.out.println("ArrayDeque Stack: " + arrayDequeStack);
        System.out.println("ArrayDeque Stack peek last element: " + arrayDequeStack.peek());


        // LinkedList
        Deque<Integer> linkedListStack = new LinkedList<>();
        linkedListStack.push(4);
        linkedListStack.push(5);
        linkedListStack.push(6);
        System.out.println("LinkedList Stack: " + linkedListStack);
        linkedListStack.pop();
        System.out.println("LinkedList Stack: " + linkedListStack);
        System.out.println("LinkedList Stack peek last element: " + linkedListStack.peek());

        // Vector (Legacy, use ArrayList instead)
        Stack<Integer> vectorStack = new Stack<>();
        vectorStack.push(7);
        vectorStack.push(8);
        vectorStack.push(9);
        System.out.println("Vector Stack: " + vectorStack);
        vectorStack.pop();
        System.out.println("Vector Stack: " + vectorStack);
        System.out.println("Vector Stack peek last element: " + vectorStack.peek());


        // Stack (Extends Vector)
        Stack<Integer> stackStack = new Stack<>();
        stackStack.push(10);
        stackStack.push(11);
        stackStack.push(12);
        System.out.println("Stack Stack: " + stackStack);
        stackStack.pop();
        System.out.println("Stack Stack: " + stackStack);
        System.out.println("Stack Stack peek last element: " + stackStack.peek());
    }
}
