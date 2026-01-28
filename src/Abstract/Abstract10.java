package Abstract;
abstract class Animal{
    public abstract void Sound();
    public static void inf0(){
        System.out.println("the is information of animal");
    }
}
class dog extends Animal{
    @Override
    public void Sound() {
        System.out.println("dog barks");
    }
}
public class Abstract10 {
    public static void main(String[] args) {
        dog dog=new dog();
        dog.Sound();
        Animal.inf0();
    }
}
