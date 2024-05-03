package FunctionalInterface.FunctionalInterface1;

// An Interface that contains exactly one abstract method is known as functional interface. It can have any number of default,
// static methods but can contain only one abstract method. It can also declare methods of object class. Functional Interface
// is also known as Single Abstract Method Interfaces or SAM Interfaces.

@FunctionalInterface
interface demoInterface {
    void greet();     // this interface can have only one abstract method but can have multiple default and static method with it
}



public class FunctionalInterface1 {
    public static void main(String[] args) {
        demoInterface di = new demoInterface() {
            @Override
            public void greet() {
                System.out.println("Hello, Good Evening!");
            }
        };

        di.greet();
    }
}
