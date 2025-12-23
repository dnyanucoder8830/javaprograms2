package polymorphism;

public class Area {
    int Calculate(int side){
        return side*side;
    }
    int Calculate(int lenght,int bredth){
        return lenght*bredth;
    }

    public static void main(String[] args) {
        Area obj=new Area();
        System.out.println("Area of squre: "+obj.Calculate(5));
        System.out.println("Area of rectange "+obj.Calculate(6,9));
    }
}
