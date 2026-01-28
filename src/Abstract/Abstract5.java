package Abstract;
abstract class vhicle{
    public abstract void Start();
}
class Bike extends vhicle{
    @Override
    public void Start() {
        System.out.println("bike Start by kick");
    }
}
class car extends vhicle{
    @Override
    public void Start() {
        System.out.println("car can start by selfstart");
    }
}
public class Abstract5 {
    public static void main(String[] args) {
        Bike bike=new Bike();
        car car=new car();
        bike.Start();
        car.Start();
    }
}
