import java.util.*;

class Animal{
  public void eat(){
    System.out.println("Animal eats food.");
  }
  protected int a;
}
class Dog extends Animal{
  void bark(){
    System.out.println("Dog barks.");
  }
  void value(){
    a=10;
    System.out.println("a="+a);
  }
}
public class Inheritance {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      Dog d=new Dog();
      d.eat();
      d.bark();
      d.value();
    }
}