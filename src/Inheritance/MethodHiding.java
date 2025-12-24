package Inheritance;

class s{
    public static void m1(){
        System.out.println("it is a static method of parent");
    }
}
class r extends s{
    public static void m1(){
        System.out.println("it is a static method of child");
    }
}
public class MethodHiding {
    public static void main(String[] args) {
        r obj = new r();
        obj.m1();
    }
}
