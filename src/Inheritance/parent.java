package Inheritance;

public class parent {
    void load(){
        System.out.println("normal method");
    }
}
class child extends parent{
    void load(){
        System.out.println("overreded method");
    }

    public static void main(String[] args) {
        parent obj=new child();
        obj.load();
    }
}