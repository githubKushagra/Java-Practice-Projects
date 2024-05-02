package ExceptionHandling;

import java.util.Scanner;

public class ArithmeticException1 {
    public static void main(String[] args) {
        System.out.println("Here we will talk about Arithmetic Exception");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to perform division btn them: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        try {
            int result = n1/n2;
            System.out.println("Division of two numbers "+n1+" and "+n2+" is: "+result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
