package Inheritance.SingleInheritance;

// Superclass
class Animal3 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Subclass accessing superclass method
class Dog2 extends Animal3 {
    void display() {
        eat(); // Calling superclass method
        System.out.println("Dog is displaying");
    }
}

public class SingleInheritance3 {
    public static void main(String[] args) {
        // Accessing Superclass Members:
        Dog2 d = new Dog2();
        d.display();
        d.eat();
    }
}
