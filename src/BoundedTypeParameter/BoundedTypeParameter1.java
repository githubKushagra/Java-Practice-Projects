package BoundedTypeParameter;

import java.util.*;

public class BoundedTypeParameter1 <T> {

//  There may be times when you want to restrict the types that can be used as type arguments in a parameterized type.
//  For example, a method that operates on numbers might only want to accept instances of Number or its subclasses.
//  This is what bounded type parameters are for.
//  <T extends Number> means T can only contain the subclass of Number like - Integer , Double , Byte , Float , BigDecimal , etc.
//  but it can't take the arguments of non-number class like String , etc.
    public <T extends Number> void getSum(T n1 , T n2) {
        int sum = n1.intValue() + n2.intValue();
        System.out.println("The sum is: " + sum);
    }
    public static void main(String[] args) {
        BoundedTypeParameter1<Integer> btp = new BoundedTypeParameter1<>();
        btp.getSum(19,20);
//      btp.getSum("20" , "55");      -> generates an error bcz we are passing string as an argument but we can pass only related to Number class values

    }
}
