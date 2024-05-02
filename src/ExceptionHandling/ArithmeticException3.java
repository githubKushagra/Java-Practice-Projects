package ExceptionHandling;

import java.util.Scanner;

public class ArithmeticException3 {
    public static int modulusOperation(int a , int b) {
        if(b == 0) {
//            throw new ArithmeticException();    // it will throw null and e.getMessage() will print null.
            throw new ArithmeticException("You can't do % operation with 0!");   // this text will go under getMessage() method and e.getMessage() will print this message.
        }
        else {
            return a%b;
        }
    }


    public static void main(String[] args) {
        System.out.println("Here we will talk about Arithmetic Exception");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to perform division btn them: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        try {
            int result = modulusOperation(n1 , n2);
            System.out.println("Modulus of two numbers "+n1+" and "+n2+" is: "+result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
