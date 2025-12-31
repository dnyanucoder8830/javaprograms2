package Exception;

public class TryCatch12 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int []c={1,2,34};
        try{
            try{
                System.out.println(a/b);
            }catch (ArithmeticException d){
                System.out.println(d);
            }
            System.out.println(c[4]);
        }catch (ArrayIndexOutOfBoundsException s){
            System.out.println(s);
        }
    }
}
