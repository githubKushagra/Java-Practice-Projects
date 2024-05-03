package ExceptionHandling;

import java.util.Scanner;


class NegativeRadiusException extends Exception{
    public String toString() {
        return "Radius Can't be Negative";
    }

    public String getMessage() {
        return "Radius Can't be Negative";
    }
}

public class ThrowAndThrowsKeyword1 {

    public static double area(double radius) throws NegativeRadiusException{
            if(radius < 0) {
                throw new NegativeRadiusException();
            }
            return Math.PI*radius*radius;
    }

    public static int divideTwoNumbers(int a , int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers for division: ");
        int a,b;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();

        try{
            int result = divideTwoNumbers(a,b);
            System.out.println("result: " + result);
        } catch (Exception e) {
            System.out.println("An Exception has occured during division calculation");
        }


        Double radius;
        System.out.println("Enter radius for calculating the area: ");
        radius = s.nextDouble();

        try{
            double result = area(radius);
            System.out.println("Area: " + (String.format("%.2f",result)));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
