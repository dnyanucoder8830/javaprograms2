package polymorphism;
class a{
    public void g(){
        System.out.println("parent class");
    }
}
class l extends a{
    public void s(){
        System.out.println("child class");
    }
}
public class DownCasting {
    public static void main(String[] args) {
        a obj=new l();
        l obj2=(l) obj;
        obj2.s();
        obj2.g();
    }
}
