package Multithreding;
class T3 extends Thread{
    @Override
    public void run() {
        System.out.println("hi i am therad");

    }
}
public class Thread3 {
    public static void main(String[] args) {
        T3 t = new T3();
        t.start();
        System.out.println(t.getName());
        t.setName("sonu");
        System.out.println(t.getName());
        System.out.println("hi am from main thread");
    }
}
