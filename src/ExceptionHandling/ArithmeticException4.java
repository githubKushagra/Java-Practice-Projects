package ExceptionHandling;

public class ArithmeticException4 {
    public static void main(String[] args) {
        System.out.println("Here we will talk about Arithmetic Exception");

        try {
            int result = Integer.MAX_VALUE + 1;     // overflow condition occurs in some of the compiler
            System.out.println("By adding 1 into max integer value: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Overflow exception occur");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
