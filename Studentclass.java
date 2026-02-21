class Student{
    int id;
    String name;
    int marks;

    Student(int id,String name,int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void displayDetails(){
        System.out.println("Id :" +id);
        System.out.println("Name : " +name);
        System.out.println("Marks :" + marks);
    }

    void checkpass(){
        if(marks>40){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}

public class Studentclass {
    public static void main(String[] args) {
        Student obj = new Student(11,"Durga",80);
        obj.displayDetails();
        obj.checkpass();
    }
    
}
