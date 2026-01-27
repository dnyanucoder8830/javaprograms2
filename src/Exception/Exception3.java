package Exception;

public class Exception3 {
    public static void main(String[] args) {
        int a=12;
        int b=23;
        int c=0;
        String g=null;
        try {
            try {
                System.out.println(a/c);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(g.length());
        } catch (Exception e) {
            System.out.println(e);
        }finally {
            System.out.println("this will exicute");
        }
    }
}
