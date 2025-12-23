package Inheritance;

public class Diver {
    int a=20;
    {
        System.out.println("I am driver");
    }
}
class passenger extends Diver{
    int b=30;
    {
        System.out.println("I am passenger");
    }
}
class conducter extends passenger{
    public static void main(String[] args) {
        Diver obj=new Diver();
        System.out.println(obj.a);
        System.out.println();
    }
}
