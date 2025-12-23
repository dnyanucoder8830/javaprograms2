package polymorphism;

public class Display {
    void show(String name){
        System.out.println("Name: "+name);
    }
    void show(String name,int age){
        System.out.println("Name: "+name+",Age: "+age);
    }

    public static void main(String[] args) {
        Display obj=new Display();
        obj.show("om");
        obj.show("om",20);
    }
}
