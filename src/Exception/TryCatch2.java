package Exception;

public class TryCatch2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};
        try {
            System.out.println(arr[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
