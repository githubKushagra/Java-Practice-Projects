package AbstractClass.AbstractClassImplementsInterface;

//  Here are some conditions for an abstract class which implements an interface:
//  The abstract class must implement all of the methods declared in the interface.
//  The abstract class can provide default implementations for the methods declared in the interface.
//  The abstract class can also declare new methods that are not declared in the interface.
//  The abstract class cannot be instantiated.
//  Any class that inherits from the abstract class must also implement all of the methods declared in the interface.


// Interface
interface Vehicle {
    void start();
    void stop();
}

// Abstract class implementing interface
abstract class AbstractVehicle implements Vehicle {
    // Implementing interface methods
    @Override
    public void start() {
        System.out.println("Vehicle started.");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle stopped.");
    }

    // Abstract method
    public abstract void accelerate();
}

// Concrete subclass extending abstract class
class Car extends AbstractVehicle {
    @Override
    public void start() {
        super.start();
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
        super.stop();
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }
}

// Concrete subclass extending abstract class
class Motorcycle extends AbstractVehicle {
    @Override
    public void start() {
        super.start();
        System.out.println("Motorcycle started.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped.");
        super.stop();
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle is accelerating.");
    }
}



public class AbstractClassImplementsInterface1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.accelerate();
        c.stop();


        Motorcycle m = new Motorcycle();
        m.start();
        m.accelerate();
        m.stop();

    }
}
