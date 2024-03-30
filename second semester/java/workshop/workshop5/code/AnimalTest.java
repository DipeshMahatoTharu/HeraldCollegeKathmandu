
//Interface Animal
interface Animal {
 void eat();
 void walk();
}

//Interface Printable
interface Printable {
 void display();
}

//Class Cow implementing Animal and Printable interfaces
class Cow implements Animal, Printable {
 @Override
 public void eat() {
     System.out.println("Cow is eating grass.");
 }

 @Override
 public void walk() {
     System.out.println("Cow is walking slowly.");
 }

 @Override
 public void display() {
     System.out.println("Displaying information about cow.");
 }
}

public class AnimalTest {
 public static void main(String[] args) {
     // Creating an instance of Cow
     Cow cow = new Cow();

     
     cow.eat();
     cow.walk();

     
     cow.display();
 }
}
