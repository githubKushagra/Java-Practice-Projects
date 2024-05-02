package BoundedTypeParameter;

import java.util.*;

class A {
    public void methodA() {
        System.out.println("Method in class A");
    }
}

interface B {
    void methodB();
}

interface C {
    void methodC();
}

class D extends A implements B,C {
    public void methodD() {
        System.out.println("Method in class D");
    }

    @Override
    public void methodB() {
        System.out.println("Method in interface B implemented in class D");
    }

    @Override
    public void methodC() {
        System.out.println("Method in interface C implemented in class D");
    }
}

public class BoundedTypeParameter3 {

//  make sure if we are using boundedtypeparameter then after extends first write classes that you want to extend then interface
//  like in my case <T extends A & B & C> I have written class first that is A and then interfaces like B & C else compile time error will be there.
    public static <T extends A & B & C> void display(T t1) {
//      In the display() method, we call methodA(), methodB(), and methodC() directly on the object t1 because these methods are inherited or implemented by A, B, and C respectively
//      It calls methodA(), methodB(), and methodC() directly on t1 because these methods are guaranteed to exist due to the type bound.
        t1.methodA();
        t1.methodB();
        t1.methodC();

        if(t1 instanceof D) {
//          Since methodD() is specific to class D, we first check if t1 is an instance of D using the instanceof operator, then cast t1 to D and call methodD().
            D d = (D) t1;
            d.methodD();
        }
    }
    public static void main(String[] args) {
        BoundedTypeParameter3.display(new D());
    }
}
