package TypeCasting;

class Animal{
    void eat(){
        System.out.println("Animal can eat");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("dog bark");
    }
}
public class Upcasting1 {
    public static void main(String[] args) {
        dog d=new dog();
        Animal A=d;
        A.eat();
    }
}
