package Multithreding;

class t6 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName());
            Thread.currentThread().setName("Run method");
        }
    }
}


public class Thread5 {
    public static void main(String[] args) {
        t6 t=new t6();
        Thread t2=new Thread(t);
        t2.start();

        }
    }

