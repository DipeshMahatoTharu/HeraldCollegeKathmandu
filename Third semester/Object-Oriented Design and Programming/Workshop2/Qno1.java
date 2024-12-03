/*Basic Inheritance (Single Inheritance): 

Create a class Animal with properties like name and age. 
Create a subclass Dog that inherits from Animal and adds a property breed.
Demonstrate the use of constructors in both the Animal and Dog classes. */



class Animal{
    String name;
    int age;
    
    public Animal(String name , int age){
        this.name=name;
        this.age=age;    

    }

}
class Dog extends Animal{
    String breed;

    public Dog(String name , int age,String breed){
        super(name,age);
       this.breed=breed;

    }
    public void result(){
        System.out.println("Name :"+ name +"\nage :"+age +"\nbreed :" +breed );
    }

}

 public class Qno1 {
    public static void main(String[] args) {
        Dog dog =new Dog("doggy ",21 ," doogggg");
        dog.result();

    }

    
 }