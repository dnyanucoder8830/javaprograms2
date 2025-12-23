package Exception;

public class TryCatch7 {
    public static void main(String[] args) {
        try {
            try {
                int  a=10/0;
            }catch (ArithmeticException a){
                System.out.println(a);
            }
            int[]array={2,3};
            System.out.println(array[2]);
        }catch (ArrayIndexOutOfBoundsException i){
            System.out.println(i);
        }
    }
}
