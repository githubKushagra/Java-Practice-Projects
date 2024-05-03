package Inheritance.SingleInheritance;

// Superclass
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritance1 {
    public static void main(String[] args) {
        // Basic Single Inheritance:
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
