package Comparable;


import java.util.*;

// the method compareTo() which is in comparable interface will take only one parameter as Object o1 and compare with current objects value

public class Comparable1 {
    public static void main(String[] args) {
        List<Student2> values = new ArrayList<>();
        values.add(new Student2(1,"Kushagra" , 88));
        values.add(new Student2(2,"Saksham" , 78));
        values.add(new Student2(3,"Tarun" , 99));
        values.add(new Student2(4,"Utkarsh" , 80));


        System.out.println("List of type Student Class : " + values);

        System.out.println("Printing List ot type student class using for loop: ");
        for(Student2 s : values) {
            System.out.println(s);
        }

        Collections.sort(values);
        System.out.println("After sorting the objects of student class based on their marks using comparable interface, we're Printing the List ot type student class using for loop: ");
        for(Student2 s : values) {
            System.out.println(s);
        }
    }
}



class Student2 implements Comparable<Student2> {
    public int regno;
    public String name;
    public int marks;

    public Student2(int regno , String name , int marks) {
        this.regno = regno;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student2 s1) {
        if(this.marks > s1.marks) {
            return 1;
        }
        return -1;
    }

    public String toString() {
        return "Student {Regno : " + regno + ", Name : " + name + ", Marks : " + marks + '}';
    }
}
