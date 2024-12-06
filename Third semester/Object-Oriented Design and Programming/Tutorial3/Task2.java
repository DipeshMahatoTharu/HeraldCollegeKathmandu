abstract class Employee {
    String name; 
    int id;


    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

 
    abstract double calculateSalary();


    void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}


class FullTimeEmployee extends Employee {
    double fixedMonthlySalary;

    FullTimeEmployee(String name, int id, double fixedMonthlySalary) {
        super(name, id);
        this.fixedMonthlySalary = fixedMonthlySalary;
    }

    @Override
    double calculateSalary() {
        return fixedMonthlySalary;
    }
}


class PartTimeEmployee extends Employee {
    double hourlyWage;
    int hoursWorked;

    PartTimeEmployee(String name, int id, double hourlyWage, int hoursWorked) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}

class Task2 {
    public static void main(String[] args) {

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Dipesh", 1, 5000.0);
   
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("SDDDSD", 2, 20.0, 120);

    
        fullTimeEmployee.getDetails();
        System.out.println("Salary: $" + fullTimeEmployee.calculateSalary());

       
        partTimeEmployee.getDetails();
        System.out.println("Salary: $" + partTimeEmployee.calculateSalary());
    }
}
