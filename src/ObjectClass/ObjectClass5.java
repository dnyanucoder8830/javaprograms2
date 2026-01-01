package ObjectClass;
class car1{
    int a=10;

    @Override
    public int hashCode() {
       return this.a;
    }
}
public class ObjectClass5 {
    public static void main(String[] args) {
        car1 obj = new car1();
        System.out.println(obj.hashCode());
    }
}
