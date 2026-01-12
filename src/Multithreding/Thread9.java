package Multithreding;
class t9 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
                System.out.println("hii");
        }
    }
}
public class Thread9 {
    public static void main(String[] args)throws Exception{
        t9 obj = new t9();
        Thread t = new Thread(obj);
        t.start();
//        Thread.yield();
        for (int i = 0; i <5; i++) {
            System.out.println("hello");
        }
    }
}
