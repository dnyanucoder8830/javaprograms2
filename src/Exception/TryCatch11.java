package Exception;

public class TryCatch11 {
    public static void main(String[] args) {
    int a=20;
    int b=0;
        try {
            System.out.println(a/b);
        }catch(NullPointerException n){
            System.out.println(n);
        }catch (ArrayIndexOutOfBoundsException s){
            System.out.println(s);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

