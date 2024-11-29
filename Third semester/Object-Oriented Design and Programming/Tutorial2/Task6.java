/*  Create subclasses Dog and Cat that inherit from Animal and
override the makeSound() method with barking and meowing,
respectively.*/

// Hierarchical  (parents having multiple child)

class Dog extends Animal {
//  runtime poly (method overriding )
    @Override
    public void makeSound() {
         super.makeSound();
        System.out.println("wooff wooff");
        
    }   
}

class Cat extends Animal{
    @Override
    public void makeSound(){
      System.out.println("MEOWWW !!");
    }
}

public class Task6 {
    public static void main(String[] args) {
        Dog dog =new Dog();
        Cat cat =new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
