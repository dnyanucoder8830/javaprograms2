package polymorphism;
class c{
    public void method(){
        System.out.println("it is a method");
    }
}
class f extends c{
    public void m(){
        System.out.println("it is from child");
    }
}
public class DemoMethod {
    public static void main(String[] args) {
        c obj=new c();
        obj.method();
    }
}
