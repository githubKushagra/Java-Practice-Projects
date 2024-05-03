package Inheritance.SingleInheritance;

// Superclass
class Animal4 {
    Animal4() {
        System.out.println("Animal constructor...");
    }
}

// Subclass invoking superclass constructor
class Dog3 extends Animal4 {
    Dog3() {
        System.out.println("Dog constructor...");
    }
}

public class SingleInheritance4 {
    public static void main(String[] args) {
        // Constructor Inheritance:
        Dog3 d = new Dog3();
        Animal4 a = new Animal4();
        Animal4 a2 = new Dog3();
    }
}
