package Encasulation;

class Student {
    private int rollno;
    private String name;
     public void setdate(int r,String s){
         rollno =r;
         name=s;
     }
     public void show(){
         System.out.println("name is "+name);
         System.out.println("roll number is"+rollno);
     }
}
public class Encap1 {
    public static void main(String[] args) {
        Student s=new Student();
        s.setdate(1,"dnyanu");
        s.show();
    }
}
