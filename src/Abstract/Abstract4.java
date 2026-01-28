package Abstract;

abstract class shape{
    public abstract void area(double a, int b);
}
class circle extends shape{
    @Override
    public void area(double a, int b) {
        a = (int) 3.14;
        System.out.println(a*b);
    }
}
class rectange extends shape{
    @Override
    public void area(double a, int b) {
        System.out.println(a*b);
    }
}
public class Abstract4 {
    public static void main(String[] args) {
        circle obj1=new circle();
        rectange obj2=new rectange();
        obj1.area(3.14,5);
        obj2.area(2,6);
    }
}
