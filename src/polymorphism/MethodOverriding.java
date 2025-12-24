package polymorphism;
class h{
    public void add(){
        System.out.println("this is method without argument");
    }
    public void add(int a){
        System.out.println("this is a method with parameters");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        h obj=new h();
        obj.add();
        obj.add(1);
    }

}
