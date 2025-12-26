package polymorphism;

class animal{
    public void sound(){
        System.out.println("animal talk");
    }
}
class dog extends animal{
    public void sound(){
        System.out.println("dog bark");
    }
}
class cat extends animal{
    public void sound(){
        System.out.println("cat moew");
    }
}

public class Prcatice1 {
    public static void main(String[] args) {
     animal obj=new animal();
     animal obj2=new dog();
     animal obj3=new cat();
     obj.sound();
     obj2.sound();
     obj3.sound();
    }
}