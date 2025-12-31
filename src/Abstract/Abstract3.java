package Abstract;

abstract class a{
    abstract void m1(int a,int b);
}
class b extends a{

    @Override
    void m1(int a, int b) {
        System.out.println(a+b);
    }
}
class c extends a{
    void m1(int a,int b){
        System.out.println(a-b);
    }
}
public class Abstract3 {
    public static void main(String[] args) {
       c obj=new c();
       b obj1=new b();
       obj1.m1(1,2);
       obj.m1(1,2);
    }
}
