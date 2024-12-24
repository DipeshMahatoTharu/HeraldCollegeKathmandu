package wotkshop5;

class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    public void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Qno3 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum (int): " + calc.add(5, 10));
        System.out.println("Sum (double): " + calc.add(5.5, 10.5));

        Animal myDog = new Dog();
        myDog.sound();
    }
}
