package NestedClassConcept.StaticClass;

class OuterClass {
    int age;

    public OuterClass(int age) {
        this.age = age;
    }

    public void displayAge() {
        System.out.println("Age: " + age);
    }

    public static void greet() {
        System.out.println("Hello, GoodEvening!");
    }

    static class StaticInnerClass {
        double marks;

        public StaticInnerClass(double marks) {
            this.marks = marks;
        }

        public void displayMarks() {
            System.out.println("Marks: " + marks);
            greet();
//            displayAge();  // i can't call this outer class mth inside the inner class bcz we can't access any non-static method from static class
        }
    }
}



public class StaticInnerClass1 {
    public static void main(String[] args) {
        OuterClass otc = new OuterClass(20);
        otc.displayAge();

        OuterClass.StaticInnerClass sinc = new OuterClass.StaticInnerClass(88.8);
        sinc.displayMarks();
    }
}
