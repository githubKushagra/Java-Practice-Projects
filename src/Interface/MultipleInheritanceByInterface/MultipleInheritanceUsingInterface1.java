package Interface.MultipleInheritanceByInterface;

interface MyInterface1{
    void greet();
}

interface MyInterface2{
    void displayName();
}


// example of multiple inheritance
class MyDemoClass2 implements MyInterface1 , MyInterface2 {
    @Override
    public void greet() {
        System.out.println("Hello, Good Evening!");
    }

    @Override
    public void displayName() {
        System.out.println("This is Kushagra Varshney");
    }
}

public class MultipleInheritanceUsingInterface1 {
    public static void main(String[] args) {
        MyDemoClass2 mdc = new MyDemoClass2();
        mdc.greet();
        mdc.displayName();
    }
}
