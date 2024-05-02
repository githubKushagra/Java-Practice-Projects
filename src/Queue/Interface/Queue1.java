package Queue.Interface;


import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
//      using LinkedList
//      features - Implements a doubly-linked list-based queue.
//      Offers constant time operations for adding and removing elements from the beginning or end of the queue (addFirst(), addLast(), removeFirst(), removeLast()).
//      Allows null elements and preserves insertion order.
//      Provides efficient insertion and removal in the middle of the queue.
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.offer(67);
        q1.offer(34);
        q1.add(19);
        q1.offer(20);
        System.out.println("Queue using LinkedList class: " + q1);
        q1.remove();
        System.out.println("Queue using LinkedList class: " + q1);
        q1.poll();
        System.out.println("Queue using LinkedList class: " + q1);
        System.out.println("First element from queue: " + q1.element());
        System.out.println("First element from queue: " + q1.peek());



//      using ArrayDeque
//      features - Implements a resizable array-based queue.
//      Offers amortized constant time operations for adding and removing elements from both ends of the queue (offerFirst(), offerLast(), pollFirst(), pollLast()).
//      Does not allow null elements.
//      Supports dynamic resizing of the underlying array, which allows it to grow or shrink as needed.
//      Generally faster than LinkedList for most operations, especially random access.
//      Suitable for most general-purpose use cases where efficient addition and removal at both ends of the queue are required.
        Queue<Integer> q2 = new ArrayDeque<>();
        q2.add(1);
        q2.add(2);
        q2.offer(67);
        q2.offer(34);
        q2.add(19);
        q2.offer(20);
        System.out.println("Queue using ArrayDeque class: " + q2);
        q2.remove();
        System.out.println("Queue using ArrayDeque class: " + q2);
        q2.poll();
        System.out.println("Queue using ArrayDeque class: " + q1);
        System.out.println("First element from queue: " + q2.element());
        System.out.println("First element from queue: " + q2.peek());




//      using PriorityQueue
//      features - Implements a priority queue.
//      Stores elements based on their natural order or a custom comparator.
//      Provides constant time operations for insertion (offer()) and logarithmic time operations for removal (poll()).
//      Does not guarantee FIFO (First-In-First-Out) order; elements are retrieved based on their priority.
//      Suitable for scenarios where elements need to be processed in a specific order of priority, such as scheduling tasks by priority.
        Queue<Integer> q3 = new PriorityQueue<>();
        q3.add(1);
        q3.add(2);
        q3.offer(67);
        q3.offer(34);
        q3.add(19);
        q3.offer(20);
        System.out.println("Queue using priorityQueue class: " + q3);
        q3.remove();
        System.out.println("Queue using priorityQueue class: " + q3);
        q3.poll();
        System.out.println("Queue using priorityQueue class: " + q3);
        System.out.println("First element from queue: " + q3.element());
        System.out.println("First element from queue: " + q3.peek());




//      Note :- Use LinkedList if you require efficient insertion and removal at both ends of the queue or in the middle, and preservation of insertion order.
//      Use ArrayDeque if you need efficient addition and removal at both ends of the queue, faster random access, and dynamic resizing.
//      Use PriorityQueue if you need elements to be stored and retrieved based on their priority, rather than their insertion order, and you need constant-time insertion with logarithmic-time removal.

    }
}
