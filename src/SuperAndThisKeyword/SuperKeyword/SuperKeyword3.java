package SuperAndThisKeyword.SuperKeyword;

class Animal2{
    Animal2(){
        System.out.println("animal is created");
    }
}
class Dog2 extends Animal2{
    Dog2(){
        super();    // invoking the constructor of parent class
        System.out.println("dog is created");
    }
}

public class SuperKeyword3 {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        Animal2 a = new Dog2();
        Animal2 a2 = new Animal2();
    }
}
