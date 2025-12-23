package Assingment;

public class H {
    int a;
    void demo(){
        a=20;
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        H obj=new H();
        obj.demo();
    }
}
