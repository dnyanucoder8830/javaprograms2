package polymorphism;
class car{
    car(){
        System.out.println("car");
    }
}
class vical extends car{
    vical(){
        System.out.println("vical");
    }
}
public class Check {
    public static void main(String[] args) {
        car obj=new car();
    }
}
