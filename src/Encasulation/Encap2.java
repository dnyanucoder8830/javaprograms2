package Encasulation;
class Salary{
    private int salary;

    public void setSalary(int s) {
        salary=s;
    }
    public int getsalary(){
        return salary;
    }
}
public class Encap2{
    public static void main(String[] args) {
        Salary s=new Salary();
        s.setSalary(10000);
        System.out.println("salary is "+s.getsalary());
        s.setSalary(20000);
        System.out.println("now salary is "+s.getsalary());
    }
}
