/*Super Keyword: 

Extend the Animal and Dog example by adding a constructor to the Animal class that takes a name parameter. 
In the Dog class, use the super keyword to call the constructor of the Animal class. 
Create instances of Dog and demonstrate the use of the super keyword.*/


class Animal3{
    String name;
    public Animal3(String name){
        this.name=name;


    }

}
class Dog3 extends Animal3{

int age;
    public Dog3(String name ,int age){
    super(name);
    this.age=age;
   }
   public void result(){
    System.out.println("Name " + name  + "age " +age);
 

   }

}
public class  Qno3 {
    public static void main(String[] args) {
      Dog3 dog =new Dog3("Dasda",13);
      dog.result();


    }

}