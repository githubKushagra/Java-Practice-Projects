package WildCard;

import java.util.*;

public class WildCard1 {

//  this is the method that we were using previously without using wildcard
    public static <T> void getList(List<T> list) {
        System.out.print("Items in the list: ");
        for(T obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }


//  same method (that we have written previously) using wildcard syntax, and we don't have to specify <T> in method declaration
    public static void displayList(List<?> list) {
        System.out.print("items in the list using wildcard: ");
        for(Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<String> list2 = Arrays.asList("a" , "b" , "c" , "d" , "e");
        List<Object> list3 = Arrays.asList(1,"kushagra" , 88.8);

//      calling the getList() method
        getList(list1);
        getList(list2);
        getList(list3);


//      calling the wildcard method that is displayList()
        displayList(list1);
        displayList(list2);
        displayList(list3);

    }
}
