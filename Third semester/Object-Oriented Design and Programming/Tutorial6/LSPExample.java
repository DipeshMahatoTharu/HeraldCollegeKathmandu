/*The Liskov Substitution Principle states that objects of a
superclass should be replaceable with objects of a subclass without
 altering the correctness of the program. */
class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Sparrow extends Bird {
}

class LSPExample {
    public static void main(String[] args) {
        Bird bird = new Sparrow(); 
        bird.fly();
    }
}
