package polymorphism;

public class parent {
    void Greed(){
        System.out.println("Hello from parent");
    }
}
class child extends parent{
    void Greed(){
        System.out.println("Hello from child");
    }

    public static void main(String[] args) {
        parent obj=new child();
        obj.Greed();
    }
}