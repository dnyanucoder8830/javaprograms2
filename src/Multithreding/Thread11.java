package Multithreding;
class t11 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
            System.out.println("thread1");
        }
    }
}class c1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
            System.out.println("Thread2");
        }
    }
}
public class Thread11 {
    public static void main(String[] args) {
        t11 obj = new t11();
        c1 obj2 = new c1();
        Thread t = new Thread(obj2);
        Thread t2=new Thread(obj);
        t.start();
        t2.start();
        for (int i = 0; i <5; i++) {
            System.out.println("mainThread");
        }

    }
}
