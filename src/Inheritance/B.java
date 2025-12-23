package Inheritance;

public class B {
    static int a;
    static {
        System.out.println("it is from B");
    }
}
class C extends B{
    static  int b;
    static {
        System.out.println("it is from B");
    }
}
class D extends C{
    public static void main(String[] args) {
        System.out.println("it is a main method");
        System.out.println(a);
        System.out.println(b);
    }
}