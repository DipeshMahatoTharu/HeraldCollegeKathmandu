abstract class Vehicle {
    int speed; // Common field
    String fuel; // Common field

    // Constructor
    Vehicle(int speed, String fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    // Abstract methods
    abstract double fuelEfficiency(); // Return km/l or equivalent
    abstract int topSpeed(); // Return top speed in km/h

    // Common method
    void displayDetails() {
        System.out.println("Fuel: " + fuel);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    double mileage; // Mileage in km/l

    Car(int speed, String fuel, double mileage) {
        super(speed, fuel);
        this.mileage = mileage;
    }

    @Override
    double fuelEfficiency() {
        return mileage; // Return the mileage
    }

    @Override
    int topSpeed() {
        return speed; 
    }
}

class Bike extends Vehicle {
    double mileage; 

    Bike(int speed, String fuel, double mileage) {
        super(speed, fuel);
        this.mileage = mileage;
    }

    @Override
    double fuelEfficiency() {
        return mileage;
    }

    @Override
    int topSpeed() {
        return speed; 
    }
}

public class Task3 {
    public static void main(String[] args) {
       
        Car car = new Car(220, "Petrol", 15.0);

       
        Bike bike = new Bike(180, "Petrol", 40.0);

        System.out.println("Car Details:");
        car.displayDetails();
        System.out.println("Fuel Efficiency: " + car.fuelEfficiency() + " km/l");
        System.out.println("Top Speed: " + car.topSpeed() + " km/h");
        System.out.println();

       
        System.out.println("Bike Details:");
        bike.displayDetails();
        System.out.println("Fuel Efficiency: " + bike.fuelEfficiency() + " km/l");
        System.out.println("Top Speed: " + bike.topSpeed() + " km/h");
    }
}
