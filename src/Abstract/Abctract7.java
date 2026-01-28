package Abstract;
abstract class Bank{
    public abstract void GetReteOfIntrest();
}
class SBI extends Bank{
    @Override
    public void GetReteOfIntrest() {
        System.out.println("for loan we have rate intrest is 12%");
    }
}
class HDFC extends Bank{
    @Override
    public void GetReteOfIntrest() {
        System.out.println("for loan we have rate intrest is 14%");
    }
}
public class Abctract7 {
    public static void main(String[] args) {
        SBI sbi=new SBI();
        HDFC hdfc=new HDFC();
        sbi.GetReteOfIntrest();
        hdfc.GetReteOfIntrest();
    }
}
