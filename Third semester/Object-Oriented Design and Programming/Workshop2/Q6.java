
// Final Class
final class FinalClass1 {
    public void displayMessage() {
        System.out.println("This is a final class.");
    }
}

// Uncommenting the below code will cause a compiler error because FinalClass is final
// class Hello extends FinalClass {
//     @Override
//     public void displayMessage() {
//         super.displayMessage();
//         System.out.println("This is child class.");
//     }
// }

// Class with final method
class Parent2 {
    public final void displayMessage() {
        System.out.println("This is a final method in Parent class.");
    }
}

class Child1 extends Parent2 {
    // Uncommenting the below code will cause a compiler error because displayMessage() is final
    // @Override
    // public void displayMessage() {
    //     System.out.println("Trying to override final method.");
    // }
}

public class Q6 {
    public static void main(String[] args) {
        // Demonstrating final class
        FinalClass1 finalObj = new FinalClass1();
        finalObj.displayMessage();

        // Demonstrating final method
        Parent2 parentObj = new Parent2();
        parentObj.displayMessage();

        // Uncommenting this will cause a compiler error
        // Child1 childObj = new Child1();
        // childObj.displayMessage();
    }
}
