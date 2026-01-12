package Multithreding;
class t8 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("hii");
            try{
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Thread8 {
    public static void main(String[] args) {
        t8 obj = new t8();
        Thread t = new Thread(obj);
        t.start();
    }
}