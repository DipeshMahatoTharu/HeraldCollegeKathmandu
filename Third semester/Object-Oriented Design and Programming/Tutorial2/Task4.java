//Create a subclass Employee that inherits from Person and adds an attribute employeeId.

// single inheritance parents having  one child 
class Employee extends Person{
    int employeeId;

}
public class Task4 {

    public static void main(String[] args) {   
        Employee employee= new Employee();
        employee.name= "Dipesh";
        employee.age= 27;
        employee.employeeId=21;
        System.out.println("Name "+ employee.name +"\nAge "+ employee.age + "\nemployeeID "+ employee.employeeId);    
    }
}