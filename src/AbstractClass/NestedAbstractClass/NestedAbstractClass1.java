package AbstractClass.NestedAbstractClass;

abstract class MyAbstractClass {
    public MyAbstractClass() {
        System.out.println("Constructor from MyAbstractClass...");
    }
    abstract void greet();

    // nested abstract class
    abstract class MyNestedAbstractClass {
        public MyNestedAbstractClass() {
            System.out.println("Constructor from MyNestedAbstractClass...");
        }
        abstract void displayName();
    }
}

class MyDemoClassForOuterAbstractClass extends MyAbstractClass {
    void greet() {
        System.out.println("Hello, Good Evening...");
    }

//    class inside the class for implements the nested abstract class.
    class MyDemoClassForNestedAbstractClass extends MyNestedAbstractClass {
        void displayName() {
            System.out.println("This is Kushagra Varshney");
        }
    }
}

public class NestedAbstractClass1 {
    public static void main(String[] args) {
        MyDemoClassForOuterAbstractClass dc1 = new MyDemoClassForOuterAbstractClass();
        dc1.greet();

        MyDemoClassForOuterAbstractClass.MyDemoClassForNestedAbstractClass dc2 = dc1.new MyDemoClassForNestedAbstractClass();
        dc2.displayName();
    }
}
