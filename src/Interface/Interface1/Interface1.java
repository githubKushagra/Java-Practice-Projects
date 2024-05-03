package Interface.Interface1;
interface MyInterface {

    void greet();

    default void defaultMethod() {
        System.out.println("This is default method");
    }

    static void staticMethod() {
        System.out.println("This is static method");
    }

    // Constant variable and final variable, and we can call it directly just like static method calling from interface
    String INTERFACE_NAME = "MyInterface";
    final double marks = 88.8;
}


class MyDemoClass implements MyInterface {
    public void greet() {
        System.out.println("Hello, This is Kushagra Varshney");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        MyDemoClass mdc = new MyDemoClass();
        mdc.greet();
        mdc.defaultMethod();
        MyInterface.staticMethod();
        System.out.println("Interface name: " + MyInterface.INTERFACE_NAME);
        System.out.println("Final marks: " + MyInterface.marks);
    }
}
