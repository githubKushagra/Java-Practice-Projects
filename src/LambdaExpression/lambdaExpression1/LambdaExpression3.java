package LambdaExpression.lambdaExpression1;

interface MyInterface1 {
    public double additionOfTwoNumber(double a , double b);
}

public class LambdaExpression3 {
    public static void main(String[] args) {
        // implement interface using anonymous class
        MyInterface1 mi = new MyInterface1() {
            @Override
            public double additionOfTwoNumber(double a, double b) {
                return a + b;
            }
        };
        System.out.println("Addition of two numbers 19.19 and 20.20 using anonymous class is: " + mi.additionOfTwoNumber(19.19,20.20));


        // implement interface using lambda expression
        MyInterface1 mi2 = (a , b) -> a+b;
        // OR (both the statement(statements of line no. 20 and 22) are same will do same task
//        MyInterface1 mi3 = (a , b) ->  {
//            return a+b;
//        };


        double result = mi.additionOfTwoNumber(19.19,20.20);
        System.out.println("Addition of two numbers 19.19 and 20.20 using lambda expression is: " + result);
    }
}
