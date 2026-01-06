package wrapper;

public class Wrapper4 {
    public static void main(String[] args) {
        Integer a=null;
        try {
            int b=a;
            System.out.println(a);
        }catch (NullPointerException e){
            System.out.println(e);
        }finally {
            System.out.println("this must exicute");
        }
    }
}
