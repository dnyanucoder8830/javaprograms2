package polymorphism;
class u{
    int a=234;
    public void s(){
        System.out.println("the number is"+a);
    }
}
class k extends u{
    int b=12;
    public void r(){
        System.out.println("the number is "+b);
    }
}
public class RefrenceMethod {
    public static void main(String[] args) {
        u obj = new u();

    }
}