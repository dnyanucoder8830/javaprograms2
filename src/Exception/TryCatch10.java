package Exception;

public class TryCatch10 {
    public static void main(String[] args) {
      String a=null;
       try {
           System.out.println(a.length());
       }catch (Exception b){
           System.out.println(b);
       }
 }
}
