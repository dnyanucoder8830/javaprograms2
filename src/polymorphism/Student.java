package polymorphism;

public class Student {
    String name;
    int age;
    Student(){
        name="Unknown";
        age =0;
    }
    Student(String n,int a){
        name=n;
        age=a;
    }
    void display(){
        System.out.println("Name: "+name+"   age: "+age);
    }

    public static void main(String[] args) {
        Student obj=new Student();
        Student obj1=new Student("priya",20);
        obj.display();
        obj1.display();
    }
}
