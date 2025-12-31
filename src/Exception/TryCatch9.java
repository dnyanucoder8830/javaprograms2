package Exception;

public class TryCatch9 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        try {
            System.out.println(a[6]);
        } catch (ArrayIndexOutOfBoundsException s) {
            System.out.println(s);
        }
    }
}
