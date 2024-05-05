package SuperAndThisKeyword.SuperKeyword;

// main use of super keyword used here

class Person{
    int id;
    String name;
    Person(int id,String name){
        this.id=id;
        this.name=name;
    }
}

class Emp extends Person{
    float salary;
    Emp(int id,String name,float salary){
        super(id,name);//reusing parent constructor
        this.salary=salary;
    }
    void display(){
        System.out.println("ID: " + id+", Name: "+name+", and Salary: "+salary);
    }
}

public class SuperKeyword4 {
    public static void main(String[] args) {
        Emp e = new Emp(1,"Kushagra Varshney" , 2500000.00f);
        e.display();
    }
}
