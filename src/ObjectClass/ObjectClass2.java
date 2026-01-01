package ObjectClass;
class car{
    int a=10;

    @Override
    public String toString() {
        return "this is String representation of object";
    }
}
public class ObjectClass2 {
    public static void main(String[] args) {
        car obj=new car();
        System.out.println(obj);
    }
}
