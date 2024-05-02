// Set is an interface and to implement that we have 3 classes -
// 1. hashSet class
// 2. LinkedHashSet
// 3. TreeSet


package Set.Interface;

import java.util.*;

public class Set1 {
    public static void main(String[] args) {
//        when we use hashset then insertion of elements will happen in a random order.We can't insert duplicates value in the set
        Set<Integer> setItems = new HashSet<>();

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

        // Clearing the set
        setItems.clear();
        System.out.println("After clearing the set: " + setItems);

    }
}
