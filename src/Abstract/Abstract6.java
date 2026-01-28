package Abstract;
abstract class giri{
    public abstract void m1();
    public void m2(){
        System.out.println("this method from abstatct class");
    }
}
class dnyanu extends giri{
    @Override
    public void m1() {
        System.out.println("hii");
    }
}
public class Abstract6 {
    public static void main(String[] args) {
       giri obj=new dnyanu();//calling by abstract refrence
       obj.m1();
       obj.m2();
    }
}