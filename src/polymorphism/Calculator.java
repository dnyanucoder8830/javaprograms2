package polymorphism;

public class Calculator {
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        Calculator obj=new Calculator();
        System.out.println("sum(int): "+obj.add(5,10));
        System.out.println("sum(double): "+obj.add(5.5,2.5));
    }
}
