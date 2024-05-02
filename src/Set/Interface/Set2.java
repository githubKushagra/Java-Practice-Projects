// Set is an interface and to implement that we have 3 classes -
// 1. hashSet class
// 2. LinkedHashSet
// 3. TreeSet

package Set.Interface;

import java.util.*;

public class Set2 {
    public static void main(String[] args) {
//      when we use TreeSet then insertion of elements will happen in ascending order.We can't insert duplicates value in the TreeSet
        Set<Integer> setItems = new TreeSet<>();

        setItems.add(1);
        setItems.add(67);
        setItems.add(2);
        setItems.add(45);
        setItems.add(19);
        setItems.add(37);
        setItems.add(34);

        // Printing elements in the set
        System.out.println("Elements in the set: " + setItems);

        // Checking if set is empty
        System.out.println("Is the set empty? " + setItems.isEmpty());

        // Checking the size of the set
        System.out.println("Size of the set: " + setItems.size());

        // Removing an element
        setItems.remove(67);
        System.out.println("After removing 67: " + setItems);

        // Checking if set contains an element
        System.out.println("Does the set contain 45? " + setItems.contains(45));

        // Creating an array from the set
        Integer[] array = setItems.toArray(new Integer[0]);
        System.out.print("Array from set: ");
        for (Integer item : array) {
            System.out.print(item + " ");
        }
        System.out.println();


//        System.out.println("Retrieving the first element: " + setItems.first());    -   we can do like that means we can't use first()
//        method directly bcz the first() method is not directly available in the Set interface so we have to type case first and
//        that's what we have done below

        // Accessing the first element
        System.out.println("First element: " + ((TreeSet<Integer>) setItems).first());

        // Accessing the last element
        System.out.println("Last element: " + ((TreeSet<Integer>) setItems).last());

        // Removing and returning the first element
        Integer firstElement = ((TreeSet<Integer>) setItems).pollFirst();
        System.out.println("First element removed: " + firstElement);
        System.out.println("After removing first element: " + setItems);

        // Removing and returning the last element
        Integer lastElement = ((TreeSet<Integer>) setItems).pollLast();
        System.out.println("Last element removed: " + lastElement);
        System.out.println("After removing last element: " + setItems);


        // Clearing the set
        setItems.clear();
        System.out.println("After clearing the set: " + setItems);

    }
}
