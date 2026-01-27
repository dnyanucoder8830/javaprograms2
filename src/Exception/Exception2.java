package Exception;

public class Exception2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        try {
            System.out.println(a[4]);
        } catch (Exception e) {
            System.out.println(e);
        }finally {
            System.out.println("this line execute");
        }
    }
}