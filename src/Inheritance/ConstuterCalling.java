package Inheritance;

class m{
    m(){
        System.out.println("it is constructor of parents");
    }
}
class n extends m{
    n(){
        System.out.println("it is constructor of child");
    }
}

public class ConstuterCalling {
    public static void main(String[] args) {
        n obj=new n();
    }
}
