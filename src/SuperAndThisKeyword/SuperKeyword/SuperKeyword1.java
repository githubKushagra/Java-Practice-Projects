package SuperAndThisKeyword.SuperKeyword;

class Human1{
    String name = "Kushagra Varshney";
}
class Human2 extends Human1{
    int age = 20;
    void printDetails(){
        System.out.println("Name: " + super.name);//prints name from super class using super.field keyword
        System.out.println("Age: " + age);//prints age from subclass
    }
}

public class SuperKeyword1 {
    public static void main(String[] args) {
        // super is used to refer immediate parent class instance variable.
        Human2 h = new Human2();
        h.printDetails();
    }
}
