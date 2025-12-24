package Inheritance;

class a1{
    public void m1(){
        System.out.println("perents");
    }
}
class b1 extends a1{
        public void m1() {
            super.m1();
            System.out.println("child");
        }
    }
public class InheritOverred {
    public static void main(String[] args) {
        a1 obj=new b1();
        obj.m1();
    }
}
