package NestedClassConcept.AnonymousClass;

interface demoInterface {
    void greet();
    void displayName();
}

// one way to implement interface is to create a subclass which will implement the methods of the interface and another way is by
// using anonymous class where we don't have to create a separate class .

// below code is the one way to implement interface
//class HelperClass implements demoInterface {
//    public void greet() {
//        System.out.println("GoodEvening Everyone!");
//    }
//    public void displayName() {
//        System.out.println("This is Kushagra Varshney");
//    }
//}

public class AnonymousClass1 {
    public static void main(String[] args) {
        // creating an anonymous class
        demoInterface di = new demoInterface() {
          public void greet() {
              System.out.println("GoodEvening Everyone!");
          }
          public void displayName() {
              System.out.println("This is Kushagra Varshney");
          }
        };

        di.greet();
        di.displayName();
    }
}
