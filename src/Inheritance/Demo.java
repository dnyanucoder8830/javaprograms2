package Inheritance;

class a{
    int a=10;
    public void m1(){
        System.out.println("it is from grand parent");
    }
}
class b extends a{
    int b=20;
    public void m2(){
        System.out.println("it is from parent");
    }
}
class c extends b{
    int c=30;
    public void m3(){
        System.out.println("it is from child");
    }
}

public class Demo {
    public static void main(String[] args) {
        c obj=new c();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
