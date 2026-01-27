package Exception;

public class Exception5 {
    public static void main(String[] args)throws ArithmeticException{
        int a=10;
        int b=0;
        try {


        System.out.println(a/b);
    }catch(Exception e){
            System.out.println(e);
        }
    }
}
