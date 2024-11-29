/*Task 16: 
Define a class Vehicle as final with a method start().
 Attempt to create a subclass Car that inherits from Vehicle and observe the result.*/ 


final class Vehicle {
    void start() {
        System.out.println("The vehicle is starting.");
    }
}


class Car extends Vehicle {
    void start() {
        System.out.println("The car is starting.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); 
        car.start();
    }
}
