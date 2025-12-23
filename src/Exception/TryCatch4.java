package Exception;

public class TryCatch4 {
    public static void main(String[] args) {
      try{
          int[] arr = new int[2];
        arr[2]=10/0;
        }catch (ArithmeticException a){
          System.out.println(a);
      }catch (ArrayIndexOutOfBoundsException b){
          System.out.println(b);
      }
    }

}