package Exception;

public class TryCatch {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException s) {
            System.out.println(s);
        }
    }
}
