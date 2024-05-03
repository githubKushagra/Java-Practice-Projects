package AbstractClass.AbstrcatClass1;

abstract class Shape {
    // Abstract method
    public abstract double calculateArea();

    // Concrete method
    public void greet() {
        System.out.println("Hello, This is Kushagra Varshney");
    }

    // Abstract class can contain constructors
    public Shape() {
        System.out.println("Constructor called from shape interface...");
    }
}


class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("Constructor called from Circle class...");
    }

    public double calculateArea() {
        return Math.PI*radius*radius;
    }
}


class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Constructor called from rectangle class...");
    }

    public double calculateArea() {
        return length*width;
    }
}



public class AbstractClass1 {
    public static void main(String[] args) {
        Shape circle = new Circle(8.88);   // it will first call the constructor of shape abstract class then class its constructor
        Shape rectangle = new Rectangle(19.19 , 20.20);     // it will first call the constructor of shape abstract class then class its constructor

        // Accessing abstract methods
        System.out.println("Area of circle: " + circle.calculateArea()); // Output: Area of circle: 78.53981633974483
        System.out.println("Area of rectangle: " + rectangle.calculateArea()); // Output: Area of rectangle: 24.0

        circle.greet();
        rectangle.greet();
//        Shape.greet();    if greet is static in nature then it will work

    }
}
