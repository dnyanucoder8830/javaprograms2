package TypeCasting;

public class Downcasting2 {
    void  load(){
        System.out.println("first load method");
    }
    Downcasting2(){
        System.out.println("normal construtor");
    }
    Downcasting2(int a){
        System.out.println("contrutor overloaded");
    }

    public static void main(String[] args) {
        Downcasting2 obj=new Downcasting2();
        obj.load();
        Downcasting2 obj2=new Downcasting2(1);
    }
}