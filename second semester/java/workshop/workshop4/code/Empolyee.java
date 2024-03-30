class Employee extends Person {
   
    private String department;

  
    public Employee(String address, String department) {
        super(address);
        this.department = department;
    }

    
    public void displayInfo() {
        
        System.out.println("Employee Address: " + address);
        System.out.println("Employee Department: " + department);
    }


    public static void main(String[] args) {
        
        Employee employee = new Employee("Lalitpur", "IT Department");    
        employee.displayInfo();
    }
}
