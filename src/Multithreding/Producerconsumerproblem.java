package Multithreding;
class buffer {
    int item;
    boolean full = false;

    public synchronized void produce(int value) {
        while (full) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        item = value;
        full = true;
        System.out.println("produced =" + item);
        notify();
    }

    public synchronized void consumer() {
        while (!full) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("consume " + item);
        notify();
    }
}
class produsor extends Thread{
    buffer b;
    produsor(buffer b){
        this.b=b;
    }

    @Override
    public void run() {
        b.produce(10);

        }
    }

class consumer extends Thread{
    buffer b;
    consumer(buffer b){
        this.b=b;
    }

    @Override
    public void run() {
        b.consumer();
    }
}
public class Producerconsumerproblem {
    public static void main(String[] args) {
        buffer b=new buffer();
        produsor p=new produsor(b);
        consumer c=new consumer(b);
        p.start();
        c.start();
    }
}
