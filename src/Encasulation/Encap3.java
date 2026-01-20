package Encasulation;
class Vote{
    private int age;
    public void setAge(int a){
        if(a>18){
            System.out.println("you can vote");
            age=a;
        }else{
            System.out.println("you can not vote");
        }
    }
    public int getAge(){
        return age;
    }
}
public class Encap3 {
    public static void main(String[] args) {
        Vote v=new Vote();
        v.setAge(23);
        System.out.println(v.getAge());
    }
}
