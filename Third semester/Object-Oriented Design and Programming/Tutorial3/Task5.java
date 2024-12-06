interface Drivable {
    void start();
    void accelerate();
    void brake();
}

class Car1 implements Drivable {
    private String model;

    public Car1(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println(model + " Car is starting...");
    }

    @Override
    public void accelerate() {
        System.out.println(model + " Car is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println(model + " Car is braking...");
    }
}

class Truck implements Drivable {
    private String model;

    public Truck(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println(model + " Truck is starting...");
    }

    @Override
    public void accelerate() {
        System.out.println(model + " Truck is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println(model + " Truck is braking...");
    }
}

public class Task5 {
    public static void main(String[] args) {
        Drivable car1 = new Car1("Toyota");
        Drivable truck = new Truck("Volvo");

        car1.start();
        car1.accelerate();
        car1.brake();

        truck.start();
        truck.accelerate();
        truck.brake();
    }
}
