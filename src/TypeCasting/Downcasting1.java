package TypeCasting;

class animal{
    void sound(){
        System.out.println("animal make sounds");
    }
}
class dog1 extends animal{
    void bark(){
        System.out.println("dog bark");
    }
    void fetch(){
        System.out.println("dog fetch the ball");
    }
}
public class Downcasting1 {
    public static void main(String[] args) {
        dog1 a=new dog1();
        dog1 d= a;
        a.sound();
        //a.fetch();
    }
}
