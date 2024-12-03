    /*Method overloading 

    Create a class ,’Calculator’ that should be able to perform addition operations for both integers and doubles. Implement the following steps: 

    Create an instance of the Calculator class. 

    Use the add method to add two integers (e.g., 5 and 8) and display the result. 

    Call the add method with three integers (e.g., 10, 15, and 20) and display the result. 

    Use the add method to add two doubles (e.g., 3.5 and 2.7) and display the result. 

    Call the add method with three doubles (e.g., 1.1, 2.2, and 3.3) and display the result. */
    class Calculator {
     
        public int add(int a, int b) {
            return a + b;
        }
    
        public int add(int a, int b, int c) {
            return a + b + c;
        }
    
        public double add(double a, double b) {
            return a + b;
        }
    
        public double add(double a, double b, double c) {
            return a + b + c;
        }
    }
    
    public class Qno7 {
        public static void main(String[] args) {
            // instance ofpr Calculator class
            Calculator calculator = new Calculator();
    
       
            int result1 = calculator.add(5, 8);
            System.out.println("Sum of two integers (5 + 8): " + result1);
    
          
            int result2 = calculator.add(10, 15, 20);
            System.out.println("Sum of three integers (10 + 15 + 20): " + result2);
    
       
            double result3 = calculator.add(3.5, 2.7);
            System.out.println("Sum of two doubles (3.5 + 2.7): " + result3);
    
        
            double result4 = calculator.add(1.1, 2.2, 3.3);
            System.out.println("Sum of three doubles (1.1 + 2.2 + 3.3): " + result4);
        }
    }
    