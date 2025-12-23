package Inheritance;

class A {
   static int a=10;
    public static void Demo(){
        System.out.println("it is parent");
    }
}
class child1 extends A{
    public static void main(String[] args) {
        System.out.println("it is a child");
        Demo();
        System.out.println(a);
    }
}
