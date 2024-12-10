/*Create an abstract class Vehicle with abstract methods startEngine() and
stopEngine(). Then create two classes Car and Motorcycle that extend Vehicle
and implement these methods differently.*/ 
abstract class Vehicle {

    public abstract void startEngine();
    public abstract void stopEngine();

    
}
class Carr extends Vehicle{
    @Override
    public void startEngine() {
    System.out.println("Car start bhayo!");

    }
    public void stopEngine(){
        System.out.println("Car stop bhayo!");
    }
}
class Motorcycle extends Vehicle{
    @Override
    public void startEngine() {
       System.out.println("Motorcycle Started !");
    }
    public void stopEngine(){
        System.out.println("Engine has been Stop :");

    }
}
public class Qno3 {
    public static void main(String[] args) {
    Carr carr= new Carr();
    carr.startEngine();
    carr.stopEngine();

    Motorcycle motorcycle=new Motorcycle();
    motorcycle.startEngine();
    motorcycle.stopEngine();



    }
}
