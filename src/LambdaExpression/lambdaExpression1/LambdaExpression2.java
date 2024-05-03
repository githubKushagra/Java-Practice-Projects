package LambdaExpression.lambdaExpression1;


interface MyInterface2 {
    void displayAge(String name , int age);
}

public class LambdaExpression2 {
    public static void main(String[] args) {
        MyInterface2 mi = (name , age) -> {
            System.out.println("name: " + name);
            System.out.println("Age: " + age);
        };

        mi.displayAge("Kushagra" , 20);
    }
}
