package Abstract;
abstract class employee{
    public abstract void CalculateSalary(int year,int skils);
    public void showDetails(int id,String name, int no){
        System.out.println("Employee id  "+id+" Employe name  "+name+" mobile  "+no);
    }
}
class permenetntemployee extends employee{
    @Override
    public void CalculateSalary(int year, int skils) {
        System.out.println("salary is " +year*skils);
    }
}
public class Abstract9 {
    public static void main(String[] args) {
        employee obj=new permenetntemployee();
        obj.CalculateSalary(8,15);
        obj.showDetails(101,"ramesh",232442323);
    }

}
