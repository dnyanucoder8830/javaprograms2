package polymorphism;

class calcultor{
    int a=3;
    int b=4;
    int d=12;
    double c=1.2;
    public void add(){
        int sum = a + b;
        System.out.println(sum);
    }
    public void add(int s){
        int sum=a+b+d;
        System.out.println(sum);
    }
    public void add(double n){
        double sum=c+d;
        System.out.println(sum);
    }
}
public class Calci {
    public static void main(String[] args) {
        calcultor obj = new calcultor();
        obj.add();
        obj.add(1);
        obj.add(1.1);
    }
}