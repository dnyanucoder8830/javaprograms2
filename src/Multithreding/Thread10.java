package Multithreding;
class t10 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
            System.out.println("hii");
        }
    }
}
public class Thread10 {
    public static void main(String[] args) {
        t10 obj = new t10();
        Thread t = new Thread(obj);
        t.start();
        t.setPriority(10);
        for (int i = 0; i <5; i++) {
            System.out.println("hello");
        }
    }
}
