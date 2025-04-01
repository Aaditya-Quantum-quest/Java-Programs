package Package1;

public class Cons {
    public static void main(String[] args){
        Student student1 = new Student(); // input to this constructor
        Student student2 = new Student("Alice");
        Student student3 = new Student("Connor",24); 
        student1.display();
        student2.display();
        student3.display();
    }
}

class Student{
    String name;
    int marks;

    Student(){
        this("unknown",0);
    }

    Student(String name){
        this(name ,0);
    }
    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public void display(){
        System.out.println("The name is "+name + " And the marks are "+marks);
    }
}
