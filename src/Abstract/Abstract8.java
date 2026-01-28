package Abstract;
abstract class rohit{
    rohit(){
        System.out.println("I am a construtor of abstract class");
    }
}
class omkant extends rohit{

}
public class Abstract8 {
    public static void main(String[] args) {
        omkant obj = new omkant();
    }
}