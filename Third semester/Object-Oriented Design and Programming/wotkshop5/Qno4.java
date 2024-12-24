package wotkshop5;

abstract class Employee {
    public abstract void calculateSalary();
    public abstract void displayInfo();
}

class Manager extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Manager's salary calculated.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager's Information.");
    }
}

class Programmer extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Programmer's salary calculated.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Programmer's Information.");
    }
}

public class Qno4 {
    public static void main(String[] args) {
        Employee emp1 = new Manager();
        emp1.calculateSalary();
        emp1.displayInfo();

        Employee emp2 = new Programmer();
        emp2.calculateSalary();
        emp2.displayInfo();
    }
}
