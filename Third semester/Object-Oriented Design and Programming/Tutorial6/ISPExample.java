/*Definition:
The Interface Segregation Principle states that no client should be forced to depend on methods it does not use.
 Interfaces should be small and specific.

Multiple Inheritance in Java:
Java allows multiple inheritance through interfaces. ISP ensures each interface represents a specific behavior, 
enabling clean multiple inheritance.*/
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}

class ISPExample {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}
