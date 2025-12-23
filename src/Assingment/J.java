package Assingment;

public class J {
    J(String a){
        System.out.println("It is a string value");
    }
    J(){
        System.out.println("It is a normal constructor");
    }

    public static void main(String[] args) {
        J obj1=new J("hi");
        J obj2=new J();
    }
}
