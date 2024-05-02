package Comparator.com;
import java.util.*;

// return 1 means swapping of two elements/objects
// return -1 means no swapping will be there
// return 0 means both the elements/objects are same in nature

public class Comparator2 {
    public static void main(String[] args) {
    List<Student> values = new ArrayList<>();
        values.add(new Student(1,"Kushagra" , 88));
        values.add(new Student(2,"Saksham" , 78));
        values.add(new Student(3,"Tarun" , 99));
        values.add(new Student(4,"Utkarsh" , 80));


        System.out.println("List of type Student Class : " + values);

        System.out.println("Printing List ot type student class using for loop: ");
        for(Student s : values) {
            System.out.println(s);
        }

//      Anonymous function declaration for comparator interface to sort the List objects on the bases of marks
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.marks > o2.marks) {
                    return 1;
                }

                return -1;
            }
        };
        Collections.sort(values , com);
        System.out.println("After sorting the objects of student class based on their marks using anonymous class, we're Printing the List ot type student class using for loop: ");
        for(Student s : values) {
            System.out.println(s);
        }



//      We can also use lambda expression in Collections.sort() method to sort the list
        Collections.sort(values , (s1 , s2) -> {
            return s1.marks > s2.marks ? 1 : -1;
        });
        System.out.println("After sorting the objects of student class based on their marks using lambda expression, we're Printing the List ot type student class using for loop: ");
        for(Student s : values) {
            System.out.println(s);
        }
    }
}


class Student {
    public int regno;
    public String name;
    public int marks;

    public Student(int regno , String name , int marks) {
        this.regno = regno;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student {Regno : " + regno + ", Name : " + name + ", Marks : " + marks + '}';
    }
}
