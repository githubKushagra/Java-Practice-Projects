package Inheritance.MultilevelInheritance;

// Superclass
class Animal3 {
    Animal3() {
        System.out.println("Animal constructor...");
    }
}

// Subclass invoking superclass constructor
class Dog3 extends Animal3 {
    Dog3() {
        System.out.println("Dog constructor...");
    }
}

class Cat3 extends Dog3 {
    Cat3() {
        System.out.println("Cat constructor...");
    }
}

public class MultilevelInheritance3 {
    public static void main(String[] args) {
        // Multilevel constructor:
        Cat3 c = new Cat3();

        Dog3 d = new Cat3();
        Dog3 d2 = new Dog3();

        Animal3 a = new Cat3();
        Animal3 a2 = new Dog3();
        Animal3 a3 = new Animal3();
    }
}
