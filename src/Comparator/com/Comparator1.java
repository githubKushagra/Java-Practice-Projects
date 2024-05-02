package Comparator.com;

import java.util.*;

// Comparator is an interface so to implement its method, we have to create a class which implements this comparator interface of type generic
class MyCustomComparator implements Comparator<Integer> {

//    this method will sort in ascending order
//    public int compare(Integer o1 , Integer o2) {
//        if(o1 > o2) {    // if 1st element is greater than 2nd ,then swap otw no swap
//            return 1;    // return 1 means swapping the values
//        }
//
//        return -1;    // return -1 means no need to swap the values
//    }




//    this method will sort in descending order
//    public int compare(Integer o1 , Integer o2) {
//        if(o1 < o2) {    // if 1st element is smaller than 2nd ,then swap otw no swap
//            return 1;    // return 1 means swapping the values
//        }
//
//        return -1;    // return -1 means no need to swap the values
//    }



//    this method will sort in ascending, but it will sort acc to the unit place digit
    public int compare(Integer o1 , Integer o2) {
        if(o1%10 > o2%10) {    // if unit place digit of 1st element is greater than unit place digit of 2nd element , then swap otw no swap
            return 1;    // return 1 means swapping the values
        }
        else if(o1%10 == o2%10) {
            return 0;
        }

        return -1;    // return -1 means no need to swap the values
    }
}

public class Comparator1 {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(67);
        values.add(2);
        values.add(45);
        values.add(19);
        values.add(37);
        values.add(34);


        System.out.println("List: " + values);
        Collections.sort(values);
        System.out.print("Sorting in ascending order: " + values + '\n');
        Collections.reverse(values);
        System.out.print("Sorting in descending order: "+ values + '\n');


//      created a class - MyCustomComparator for implementing the comparator interface
        Comparator<Integer> com = new MyCustomComparator();
        Collections.sort(values , com);
        System.out.println("Sorting using comparator interface : " + values);



//        we can also create anonymous class of comparator instead of creating a separate class for implementation of comparator interface
        Comparator<Integer> com2 = new Comparator<Integer>() {
            @Override
//            sort in descending order where we will sort acc to unit place digit
            public int compare(Integer o1, Integer o2) {
                if(o1%10 < o2%10) {
                    return 1;
                }
                else if(o1%10 == o2%10) {
                    return 0;
                }

                return -1;
            }
        };
        Collections.sort(values , com2);
        System.out.println("Sorting using comparator interface : " + values);



//       We can also use lambda expression to implement the comparator interface, here what we do -
        Comparator<Integer> com3 = (o1 , o2) -> {
            if(o1%10 > o2%10) {
                return 1;
            }
            else if(o1%10 == o2%10) {
                return 0;
            }

            return -1;

//            return o1%10 > o2%10 ? 1 : -1;  (using ternary operator we can do it in a single line)
        };
        Collections.sort(values , com3);
        System.out.println("Sorting using comparator interface : " + values);
    }
}
