package Inheritance.MultilevelInheritance;

// Grandparent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Parent class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Subclass inheriting from Dog
class Labrador extends Dog {
    void play() {
        System.out.println("Labrador is playing");
    }
}

public class MultilevelInheritance1 {
    public static void main(String[] args) {
        Labrador l = new Labrador();
        l.eat();
        l.bark();
        l.play();

        Dog d = new Dog();
        d.eat();
        d.bark();
        // d.play();   // it will generate an error

        Animal a = new Animal();
        a.eat();
        // the both statements (below statements) will generate an error
        // a.bark();
        // a.play();
    }
}
