package Inheritance.HierarchyInheritance;

// Superclass
class Animal2 {
    void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

// Subclass 1 overriding method from Animal
class Dog2 extends Animal2 {
    @Override
    void makeSound() {
        System.out.println("Dog is barking");
    }
}

// Subclass 2 overriding method from Animal
class Cat2 extends Animal2 {
    @Override
    void makeSound() {
        System.out.println("Cat is meowing");
    }
}

public class HierarchyInheritance2 {
    public static void main(String[] args) {
        Cat2 c = new Cat2();
        c.makeSound();

        Dog2 d = new Dog2();
        d.makeSound();

        Animal2 a = new Cat2();
        a.makeSound();
        Animal2 a2 = new Dog2();
        a2.makeSound();
        Animal2 a3 = new Animal2();
        a3.makeSound();
    }
}
