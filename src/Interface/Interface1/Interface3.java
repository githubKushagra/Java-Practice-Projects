package Interface.Interface1;

// private fields , static mth , and default mth can only be accessible inside the interface and can access using another
// static or default mth but make sure these(baad waale mths) static or default mth must be of public access modifier

interface MyInterface3 {
    int nonPrivateField = 10; // non-Private field

    private static void privateStaticMethod() { // Private static method
        System.out.println("Private static method");
    }

    private void privateDefaultMethod() { // Private default method
        System.out.println("Private default method");
    }

//  we can access private things inside the non-private things inside the same class/interface
    default void accessPrivateMembers() {
        // Accessing private field
        System.out.println("non-Private field value: " + nonPrivateField);

        // Invoking private static method
        privateStaticMethod();

        // Invoking private default method
        privateDefaultMethod();
    }
}


public class Interface3 implements MyInterface3{
    public static void main(String[] args) {
        Interface3 it3 = new Interface3();
        it3.accessPrivateMembers();
    }
}
