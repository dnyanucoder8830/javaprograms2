package Exception;

public class TryCatch8 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println(e);
        }finally {
            System.out.println("it must be run");
        }
    }
}
