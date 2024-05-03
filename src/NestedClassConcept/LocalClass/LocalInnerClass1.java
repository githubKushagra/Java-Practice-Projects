package NestedClassConcept.LocalClass;

// we can create a local class only inside the block where block can be a method , function , loop , if-else , static and non-static block , etc

class OuterClass {
    private int age = 20;

    void displayAge() {
        // creating a local inner class inside the displayAge() method
        class LocalInnerClass {
            void displayouterClassField() {
                System.out.println("Age: " + age);
            }
        }

        LocalInnerClass lic = new LocalInnerClass();
        lic.displayouterClassField();
    }

}

public class LocalInnerClass1 {
    public static void main(String[] args) {
        OuterClass otc = new OuterClass();
        otc.displayAge();
    }
}
