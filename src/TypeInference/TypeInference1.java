package TypeInference;

import java.io.Serializable;
import java.util.*;

public class TypeInference1 {

//    method 1
    public static <T> void getValue(T t1 , T t2) {
        System.out.println(t1.getClass().getName());
        System.out.println(t2.getClass().getName());
    }

//    method 2
    public static <T> void getValue(ArrayList<T> list , T t1 , T t2) {
        System.out.println(t1.getClass().getName());
        System.out.println(t2.getClass().getName());
        list.add(t1);
        list.add(t2);
        System.out.println(list.get(0).getClass().getName());
        System.out.println(list.get(1).getClass().getName());
    }

//    method 3
    public static <T> T getValueAndReturn(T n1 , T n2) {
        System.out.println(n1.getClass().getName());
        System.out.println(n2.getClass().getName());
        return n1;
    }



    public static void main(String[] args) {
//      Note :- If we're passing diff types of arguments let say 1st argu is of Integer type and 2nd argu is of String but the method
//      for which we are calling is having only single generic type <T> then for that T will become Object type bcz Object type can
//      take any type of arguments and if both the arguments belongs to Integer or String then T will become Integer type or String type



        System.out.println("From 1st getValue() method");
        TypeInference1.getValue(10,20);
        TypeInference1.getValue("10","20");
        TypeInference1.getValue(10,"20");   // here T is inferred as Object because Integer and String have a common supertype of Object.


        System.out.println("From 2nd getValue() method");
        TypeInference1.getValue(new ArrayList<>() , 10 , 20);
//      TypeInference1.getValue(new ArrayList<>() , 10 , 20);  <->  TypeInference1.getValue(new ArrayList<Integer>() , 10 , 20);
//      this is the feature of java 8 that if we are not specifying the type in any collection like arraylist then it will find acc to the context
//      but remember we can exempt to specify the type only in right hand side that is  "= new ArrayList<>()" not in left hand side.

        TypeInference1.getValue(new ArrayList<>() , "10" , "20");
//      TypeInference1.getValue(new ArrayList<>() , "10" , "20");  <->  TypeInference1.getValue(new ArrayList<String>() , "10" , "20");

        TypeInference1.getValue(new ArrayList<>() , 10 , "20");   // it is working bcz in this the type of arraylist become
//      Object and we can pass any type of data in object type like -
//      TypeInference1.getValue(new ArrayList<>() , 10 , "20");  <-> TypeInference1.getValue(new ArrayList<Object>() , 10 , "20");



        System.out.println("From 3rd getValueAndReturn() method");
        Integer valueAndReturn = getValueAndReturn(10, 20);
        System.out.println(valueAndReturn);

        String valueAndReturn2 = getValueAndReturn("10","20");
        System.out.println(valueAndReturn2);


//      valueAndReturn3 & valueAndReturn4 both are same as we have just use diff types for these

        Serializable valueAndReturn3 = getValueAndReturn(10, "20");
        System.out.println(valueAndReturn3);

        Object valueAndReturn4 = getValueAndReturn(10, "20");
        System.out.println(valueAndReturn4);

    }
}
