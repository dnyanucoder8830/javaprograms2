package ObjectClass;

class s extends Object{
    int a=10;

    @Override
    public String toString() {
        System.out.println("hi");
        return "number="+a+"it is return by to string";
    }
}


public class ObjectClass1 {
    public static void main(String[] args) {
        s obj = new s();
        System.out.println(obj);
        obj.toString();

    }
}
