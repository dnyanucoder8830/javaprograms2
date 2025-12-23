package Exception;

public class TryCatch6 {
    public static void main(String[] args) {


        try {
            int a = 10 / 2;
            System.out.println("result" + a);
        }catch (Exception e){
            System.out.println("Error:"+e);
        }
        System.out.println("program continue");
    }
}