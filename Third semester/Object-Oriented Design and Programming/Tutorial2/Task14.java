/*Define a class Animal as a final class. Try creating a subclass Dog that inherits from class Animal and observe the result.*/ 

final class Animal2{
    public void sound(){
        System.out.println("uff uff");

    }

}
// show error
class Dog extends Animal2{
    public void sound(){
      System.out.println("Bark");
    }
}
public class Task14 {
  public static void main(String[] args) {
    Dog dog=new Dog();
    dog.sound();
  
  }  
}
