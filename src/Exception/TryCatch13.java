package Exception;

public class TryCatch13{
    public void age(int a,int b)throws Exception {
        System.out.println(a / b);
    }
    public static void main(String[] args) {
        TryCatch13 obj=new TryCatch13();
        try {
            obj.age(20,0);
        }catch (Exception s){
            System.out.println("error : "+s.getMessage());
        }

        System.out.println("ending");
    }
}
