package polymorphism;
class parent1{
    public void m(){
        System.out.println("you have to do it");
    }
}
class child extends parent1{
    public void m(){
        System.out.println("i cann't");
    }
}
public class OverridMethod {
    public static void main(String[] args) {

        parent1 obj = new child();
        obj.m();
    }
}
