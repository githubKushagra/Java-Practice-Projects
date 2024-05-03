package AbstractClass.AbstrcatClass1;

abstract class MyAbstractClass1 {
    public MyAbstractClass1() {
        System.out.println("Constructor of MyAbstractClass1 invoked...");
    }

    abstract void print();
    abstract void greet();
}

// this MyAbstractClass2 class implements on of the abstract method of class MyAbstractClass1 but not all that's why
// this class is also an abstract class. if a class implements all the abstract methods of its parent class then it need
// not to be an abstract class but somehow it unable to implement all the abstract method then this class must be declared
// as abstract

abstract class MyAbstractClass2 extends MyAbstractClass1 {
    public MyAbstractClass2() {
        System.out.println("Constructor of MyAbstractClass2 invoked...");
    }

    void print() {
        System.out.println("hello world");
    }
}

class MyDemoClass1 extends MyAbstractClass2 {
    void greet() {
        System.out.println("Good Evening");
    }
}


public class AbstractClass2 {
    public static void main(String[] args) {
        MyDemoClass1 mdc = new MyDemoClass1();
        mdc.greet();
        mdc.print();
    }
}
