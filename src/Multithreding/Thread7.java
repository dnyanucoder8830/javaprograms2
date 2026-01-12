package Multithreding;

class t7 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {

            }
        }
    }
}


public class Thread7 {
    public static void main(String[] args) {
        t7 obj=new t7();
        Thread t=new Thread(obj);
        t.start();
    }
}
