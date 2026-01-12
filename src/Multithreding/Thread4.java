package Multithreding;

class t4 extends Thread{
    @Override
    public void run() {
        System.out.println("i am from run method of thread");
    }
}
public class Thread4 {
    public static void main(String[] args) {
        t4 t=new t4();
        System.out.println("i am from main thread");
        t.start();

    }

}
