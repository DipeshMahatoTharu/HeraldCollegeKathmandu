/*Protected Keyword: 

Create a class Person with a protected attribute address. 
Extend it with a subclass Employee that adds a department attribute.
 Demonstrate how the protected keyword allows access to the address property in the Employee subclass. */ 

 class Person{
    protected String address ;

    public Person(String address){
        this.address=address;
    }
    
 }
 class Employee extends Person{
    int department;

    public Employee(String address,int department){
        super(address);
        this.department=department;
        
    }
    public void result(){
     System.out.println("Address : "+address +" Deparment "+department);

    }

 }
public class Qno4 {
    public static void main(String[] args) {
        Employee employee= new Employee("sadasd",21);
        employee.result();
    }
}
