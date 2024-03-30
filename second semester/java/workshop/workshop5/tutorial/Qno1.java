
// Create an abstract class 'Parent' with an abstract method 'message'.
//  It has two subclasses, ChildClass1, and ChildClass2 each having a method with the same overriden 'message' 
// that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message'
//  by creating an object for each subclass.

abstract class Parent {

    abstract void message();
}

class ChildClass1 extends Parent {

    void message() {
        System.out.println("This is first sub class");
    }
}

class ChildClass2 extends Parent {
    void message() {
        System.out.println("This is second sub class");
    }
}

public class Qno1 {
    public static void main(String[] args) {

        ChildClass1 obj1 = new ChildClass1();
        ChildClass2 obj2 = new ChildClass2();
        obj1.message();
        obj2.message();
        
    }
}
