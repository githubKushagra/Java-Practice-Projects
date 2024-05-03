package NestedClassConcept.AnonymousClass;

abstract class demoAbstract {
    abstract void greet();
    abstract void displayName();
}
// one way to extends abstract class is to create a subclass which will extends the methods of the abstract class and another way is by
// using anonymous class where we don't have to create a separate class .

// below code is the one way to extends abstract class
// HelperClass extends demoAbstract {
//    public void greet() {
//        System.out.println("GoodEvening Everyone!");
//    }
//    public void displayName() {
//        System.out.println("This is Kushagra Varshney");
//    }
//}



public class AnonymousClass2 {
    public static void main(String[] args) {
        // implementing abstract class by anonymous class
        demoAbstract da = new demoAbstract() {
            @Override
            void greet() {
                System.out.println("GoodEvening Everyone!");
            }

            @Override
            void displayName() {
                System.out.println("This is Kushagra Varshney");
            }
        };

        da.greet();
        da.displayName();
    }
}
