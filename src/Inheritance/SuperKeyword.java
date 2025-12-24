package Inheritance;
class t{
    int a=40;
    public void m(){
        System.out.println("method from parents");
    }
}
class d extends t{
    d(){
        super.m();
        System.out.println(super.a);
    }
        }
public class SuperKeyword {
    public static void main(String[] args) {

        d obj = new d();
    }
}
