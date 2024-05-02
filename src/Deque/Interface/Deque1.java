package Deque.Interface;

import java.util.*;

public class Deque1 {
    public static void main(String[] args) {
//      using ArrayDeque class which is  faster than LinkedList for most operations, especially random access.
        Deque<Integer> dq1 = new ArrayDeque<>();
        dq1.add(10);
        dq1.addFirst(19);
        dq1.addFirst(1);
        dq1.addFirst(2);
        dq1.addLast(20);
        dq1.addLast(67);
        dq1.add(34);   // add an element at the end
        System.out.println("Deque using ArrayDeque: " + dq1);
        dq1.remove();  // remove first element
        System.out.println("Deque using ArrayDeque: " + dq1);
        dq1.removeFirst();
        System.out.println("Deque using ArrayDeque: " + dq1);
        dq1.removeLast();
        System.out.println("Deque using ArrayDeque: " + dq1);
        System.out.println("get first element from Deque: " + dq1.getFirst());
        System.out.println("get last element from Deque: " + dq1.getLast());




//      using LinkedList class which Implements a doubly-linked list-based deque but Slower than ArrayDeque for random access, but efficient for frequent insertion and removal operations in the middle.
        Deque<Integer> dq2 = new LinkedList<>();
        dq2.add(10);
        dq2.addFirst(19);
        dq2.addFirst(1);
        dq2.addFirst(2);
        dq2.addLast(20);
        dq2.addLast(67);
        dq2.add(34);   // add an element at the end
        System.out.println("Deque using LinkedList: " + dq2);
        dq2.remove();  // remove first element
        System.out.println("Deque using LinkedList: " + dq2);
        dq2.removeFirst();
        System.out.println("Deque using LinkedList: " + dq2);
        dq2.removeLast();
        System.out.println("Deque using LinkedList: " + dq2);
        System.out.println("get first element from Deque: " + dq2.getFirst());
        System.out.println("get last element from Deque: " + dq2.getLast());





    }
}
