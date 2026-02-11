package FunctionalInterface;

interface values{
    int m1(int a,int b);
}


public class Calculotor {
    public static void main(String[] args) {
        values v = (a, b) -> a * b;
        System.out.println(v.m1(12,23));
        values add=(a,b)->a+b;
        System.out.println(add.m1(12,23));
        values div=(a,b)->a/b;
        System.out.println(div.m1(12,23));
        values sub=(a,b)->a-b;
        System.out.println(sub.m1(12,23));
    }
}
