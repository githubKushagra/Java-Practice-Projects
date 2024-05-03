package Inheritance.MultilevelInheritance;

// Parent class
class Animal2 {
    void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

// Child class overriding method from parent
class Dog2 extends Animal2 {
    @Override
    void makeSound() {
        System.out.println("Dog is barking");
    }
}

// Subclass inheriting from Dog
class Labrador2 extends Dog2 {
    void makeSound() {
        System.out.println("Labrador is walking");
    }
}

public class MultilevelInheritance2 {
    public static void main(String[] args) {
        Labrador2 l = new Labrador2();
        l.makeSound();

        Dog2 d = new Labrador2();
        d.makeSound();
        Dog2 d2 = new Dog2();
        d2.makeSound();

        Animal2 a = new Labrador2();
        a.makeSound();
        Animal2 a2 = new Dog2();
        a2.makeSound();
        Animal2 a3 = new Animal2();
        a3.makeSound();

    }
}
