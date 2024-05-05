package SuperAndThisKeyword.SuperKeyword;

class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("eating bread...");
    }
    void bark(){
        System.out.println("barking...");
    }
    void work(){
        super.eat();    // invoking parent mth using super.mth
        bark();
    }
}

public class SuperKeyword2 {
    public static void main(String[] args) {
        // super can be used to invoke parent class method
        Dog d = new Dog();
        d.eat();
        d.bark();
        d.work();
    }
}
