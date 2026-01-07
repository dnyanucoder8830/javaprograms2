package Multithreding;

class T2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i am the child");
        }
    }
}
public class Thread2 {
    public static void main(String[] args) {
        T2 obj=new T2();
        Thread t=new Thread(obj);
        t.start();
        for (int i = 0; i <5; i++) {
            System.out.println("i am the parent");
        }
    }
}
