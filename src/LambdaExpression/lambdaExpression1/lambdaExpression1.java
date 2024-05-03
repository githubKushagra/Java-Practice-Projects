package LambdaExpression.lambdaExpression1;

interface MyInterface {
    void greet();
}

public class lambdaExpression1 {
    public static void main(String[] args) {
        // implement interface using anonymous function
        MyInterface mi = new MyInterface() {
            @Override
            public void greet() {
                System.out.println("Hello, This is Kushagra Varshney");
            }
        };
        mi.greet();


        // implement interface using lambda expression
        // way 1
        MyInterface mi2 = () -> {
            System.out.println("Hello, This is Kushagra Varshney");
        };
        mi2.greet();

        // way2
        MyInterface mi3 = () -> System.out.println("Hello, This is Kushagra Varshney");
        mi3.greet();
    }
}
