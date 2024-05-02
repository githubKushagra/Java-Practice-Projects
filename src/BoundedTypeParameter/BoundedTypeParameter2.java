package BoundedTypeParameter;

import java.util.*;

public class BoundedTypeParameter2 {
//  There may be times when you want to restrict the types that can be used as type arguments in a parameterized type.
//  For example, a method that operates on numbers might only want to accept instances of Number or its subclasses.
//  This is what bounded type parameters are for.
//  <T extends Number> means T can only contain the subclass of Number like - Integer , Double , Byte , Float , BigDecimal , etc.
//  but it can't take the arguments of non-number class like String , etc.
        public static <T extends Number> void getSum(T n1 , T n2) {


//          getClass(): This is a method inherited from the Object class in Java. It returns the runtime class of an object, which represents the type of the object at runtime.
//          getName(): This is a method provided by the Class in Java. It returns the fully qualified name of the class as a String. The fully qualified name includes the package name followed by the class name.
            System.out.println(n1.getClass().getName());


            if(n1.getClass().getName().contains("Integer")) {
                Integer sum = n1.intValue() + n2.intValue();
                System.out.println("Sum from two Integers: " + sum);
            } else if (n1.getClass().getName().contains("Double")) {
                Double sum = n1.doubleValue() + n2.doubleValue();
                System.out.println("Sum from two Double: " + sum);
            }  else if (n1.getClass().getName().contains("Float")) {
                Float sum = n1.floatValue() + n2.floatValue();
                System.out.println("Sum from two Float: " + sum);
            } else {
                System.out.println("Something else class from Number class");
            }
        }

    public static void main(String[] args) {
        BoundedTypeParameter2.getSum(10.2,20);
    }
}
