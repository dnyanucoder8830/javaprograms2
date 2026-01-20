package Multithreding;
 class Buffer2{
     int item;
     boolean avalable=false;
     public synchronized void produce(int value){
         while (avalable){
             try {
                 wait();
             } catch (InterruptedException e) {}

         }
         item=value;
         avalable=true;
         System.out.println("produced items" +item);
         notify();
     }
     public synchronized void consume(){
         while (!avalable){
             try{
                 wait();
             } catch (InterruptedException e) {}
         }
         System.out.println("consume items "+item);
         avalable=false;
         notify();
     }
 }

class Produser extends Thread{
     Buffer2 buffer;
    Produser(Buffer2 b){
        buffer=b;
    }
    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
           buffer.produce(i);

        }
    }
}
class Consumor extends Thread{
     Buffer2 buffer;
     Consumor(Buffer2 b){
         buffer=b;
     }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            buffer.consume();
        }

    }
}
public class Producer2 {
    public static void main(String[] args) {
        Buffer2 b = new Buffer2();
        Produser p = new Produser(b);
        Consumor c = new Consumor(b);
        p.start();
        c.start();
    }
}
