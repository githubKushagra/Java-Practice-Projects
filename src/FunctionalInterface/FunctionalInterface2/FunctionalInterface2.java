package FunctionalInterface.FunctionalInterface2;

// An Interface that contains exactly one abstract method is known as functional interface. It can have any number of default,
// static methods but can contain only one abstract method. It can also declare methods of object class. Functional Interface
// is also known as Single Abstract Method Interfaces or SAM Interfaces.

@FunctionalInterface
interface demoInterface2 {
    void greet();     // this interface can have only one abstract method but can have multiple default and static method with it
    default void defaultMethod() {
        System.out.println("This is a default method");
    }

    static void StaticMethod() {
        System.out.println("This is a static method");
    }
}

class MyDemoClass implements demoInterface2 {
    public void greet() {
        System.out.println("Hello, This is Kushagra Varshney");
    }
}




public class FunctionalInterface2 {
    public static void main(String[] args) {
        MyDemoClass mdc = new MyDemoClass();
        mdc.greet();
        mdc.defaultMethod();
        demoInterface2.StaticMethod();    // we can call static method directly using interface name
    }
}
