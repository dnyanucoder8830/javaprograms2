package polymorphism;

public class Box {
    int width,hight;
    Box(){
        width=10;
        hight=15;
    }
    Box(int w,int h){
        width=w;
        hight=h;
    }
    void Display(){
        System.out.println("Width: "+width+"  hight: "+hight);
    }

    public static void main(String[] args) {
        Box b1=new Box();
        Box b2=new Box(12,15);
        b1.Display();
        b2.Display();
    }
}
