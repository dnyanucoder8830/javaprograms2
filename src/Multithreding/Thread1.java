package Multithreding;

class T1 extends Thread{
    @Override
    public void run() {
        System.out.println("a1");
        System.out.println("a2");
        System.out.println("a3");
    }
}
public class Thread1 {
    public static void main(String[] args) {
        T1 t = new T1();
        t.start();
        System.out.println("b1");
        System.out.println("b2");
        System.out.println("b3");
//        t.start(); it will give exception IllegalThreadStateException
    }
}
