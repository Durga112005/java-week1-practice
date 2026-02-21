class Person{        //class
    String name;
    int age;

    Person(String name,int age){   
        this.name = name;
        this.age = age; 
    }

    void display(){  //method
        System.out.println(name);
        System.out.println(age);
    }
}
class Employee extends Person{
    int empid;
    int salary;

    Employee(String name,int age,int empid,int salary){
        super(name,age);
        this.empid = empid;
        this.salary = salary;
    }
    @Override
    void display(){
        super.display();
        System.out.println(empid);
        System.out.println(salary);
    }
}

public class Personclass {
    public static void main(String[] args) {
        Employee obj = new Employee("Durga",21,11,25000);
        obj.display();
        
    }
    
}
