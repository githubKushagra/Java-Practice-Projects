package Inheritance.SingleInheritance;

// Superclass
class Animal2 {
    void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

// Subclass overriding method from superclass
class Cat extends Animal2 {
    @Override
    void makeSound() {
        System.out.println("Cat is meowing");
    }
}

public class SingleInheritance2 {
    public static void main(String[] args) {
        // Overriding Methods:
        Cat c = new Cat();
        c.makeSound();

        Animal2 a = new Animal2();
        a.makeSound();

        Animal2 a2 = new Cat();
        a2.makeSound();

        // remember that lets take an example - Animal2 a2 = new Cat(); - left hand side (that is Animal2 a2) of equal to is called
        // as reference Type that means a2 is reference variable and right hand side (that is new Cat()) is called as Object type
        // that means cat() is the object type of a2 so if we override any method in inheritance then we think that which mth will
        // be called so mth called will depend on object type not reference type that means - Animal2 a2 = new Cat(); in this case
        // object is of type Cat() so makeSound() mth of Cat class will be executed.
    }
}
