package Encasulation;
class Car{
    private int salary=30000;
    public int getSalary(){
        return salary;
    }
}
public class Encap4 {
    public static void main(String[] args) {
        Car c=new Car();
        System.out.println("the salary is "+c.getSalary());
    }
}
