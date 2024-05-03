package LambdaExpression.lambdaExpression1;

//import java.util.Arrays;
import java.util.*;

class CustomComparatorClass implements Comparator<String> {
    public int compare(String a , String b) {
        return a.compareTo(b);
    }
}

public class LambdaExpression4 {
    public static void main(String[] args) {

        List<String> items = Arrays.asList("Kushagra" , "Saksham" , "kushagra" , "saksham");

        // way 1 to do sorting using lambda expression
        Collections.sort(items,(a,b) -> a.compareTo(b));
        System.out.println("List: " + items);


        // way 2 to do sorting by implementing comparator interface using anonymous class
        Comparator<String> com = new Comparator<>() {
                public int compare(String a , String b) {
                    return a.compareTo(b);    // sort in ascending order
                  //  return b.compareTo(a);    // sort in descending order
                }
        };
        Collections.sort(items , com);
        System.out.println("List: " + items);



        // way 3 by using customComparator class
        Collections.sort(items , new CustomComparatorClass());
        System.out.println("List: " + items);
    }
}
