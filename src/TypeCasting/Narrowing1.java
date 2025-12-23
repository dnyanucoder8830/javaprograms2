package TypeCasting;

public class Narrowing1 {
    public static void main(String[] args) {
        double price=322.23;
        int num=(int)price;
        System.out.println("the double value"+price);
        System.out.println("the integer after narrowing"+num);
    }
}
