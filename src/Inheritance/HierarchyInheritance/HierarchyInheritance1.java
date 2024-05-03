package Inheritance.HierarchyInheritance;

// Superclass
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Subclass 1 inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Subclass 2 inheriting from Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}


public class HierarchyInheritance1 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.meow();

        Dog d = new Dog();
        d.eat();
        d.bark();

        Animal a = new Animal();
        a.eat();
    }
}
