package TypeCasting;

class vehicle{
    void start(){
        System.out.println("vehicle can start");
    }
}
class car extends vehicle{
    void start(){
        System.out.println("car can start");
    }
}

public class Upcasting2 {
    public static void main(String[] args) {
        vehicle v = new car();
        v.start();
    }
}