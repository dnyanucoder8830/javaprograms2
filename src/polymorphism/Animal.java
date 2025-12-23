package polymorphism;

public class Animal {
    void sound(){
        System.out.println("Animal makes sound");
    }
}
  class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
  }
  class main{
      public static void main(String[] args) {
          Animal obj=new Dog();
          obj.sound();
      }
  }