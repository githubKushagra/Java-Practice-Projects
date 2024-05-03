package NestedClassConcept.InnerClass;

// if inner class is static then we can access by creating only it's instance and if inner class is non-static in nature then first we have to create instance of outer class and by using that instance we have to create instance of inner class and the only we are able to access the properties of inner class

class OuterClass {
    int age;

    public OuterClass(int age) {
        this.age = age;
    }

    public void displayAge() {
        System.out.println("Age: " + age);
    }

    class InnerNestedClass {
        double marks;

        public InnerNestedClass(double marks) {
            this.marks = marks;
        }

        public void displayMarks() {
            System.out.println("Marks: " + marks);

            displayAge();  // i can call outer class mth inside the inner class only when both outer class mth and inner class are non-static or else both are static in nature
        }
    }
}


public class InnerClass1 {
    public static void main(String[] args) {
        OuterClass otc = new OuterClass(20);
        otc.displayAge();

        OuterClass.InnerNestedClass inc = otc.new InnerNestedClass(88.8);
        inc.displayMarks();
    }
}
