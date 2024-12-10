/*Create an interface PaymentMethod with a method processPayment(double
amount). Implement it in classes Esewa and Khalti.*/ 

interface PaymentMethod {
    public void processPayment();
}
class Esewa implements PaymentMethod{
    public void processPayment(){
        System.out.println("Eesewa payment successful");
    }
}
class Khalti implements PaymentMethod{
    public void processPayment(){
        System.out.println("Khalti payment cuccessful");

    }
}
public class Qno5 {
    public static void main(String[] args) {
        Esewa esewa=new Esewa();
        esewa.processPayment();
        Khalti khalti=new Khalti();
        khalti.processPayment();
    }
    
}
