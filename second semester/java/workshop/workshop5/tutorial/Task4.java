
interface Employee {
    void printEmployeeId();
    void printSalary();
}


class Manager implements Employee {
    private int employeeId;
    private double salary;

    Manager(int employeeId, double salary) {
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void printEmployeeId() {
        System.out.println("Manager ID: " + employeeId);
    }

    public void printSalary() {
        System.out.println("Manager Salary: $" + salary);
    }
}

class Developer implements Employee {
    private int employeeId;
    private double salary;

    Developer(int employeeId, double salary) {
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void printEmployeeId() {
        System.out.println("Developer ID: " + employeeId);
    }

    public void printSalary() {
        System.out.println("Developer Salary: $" + salary);
    }
}

// Main class
public class Task4 {
    public static void main(String[] args) {
    
        Manager manager = new Manager(101, 60000);
        Developer developer = new Developer(201, 50000);

        
        manager.printEmployeeId();
        manager.printSalary();

        developer.printEmployeeId();
        developer.printSalary();
    }
}
