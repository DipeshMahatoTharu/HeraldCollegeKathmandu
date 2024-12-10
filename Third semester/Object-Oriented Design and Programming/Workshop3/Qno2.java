/*Create a class Car with private fields model, price and fuelLevel. Provide getter
and setter methods for model and price, but ensure that the fuelLevel field is
read-only.*/ 
class Car{
    private String model;
    private double price;
    private double fuelLevel;

    public Car(String model,double price, double fuelLevel){
        this.model=model;
        this.price=price;
        this.fuelLevel=fuelLevel;
    }

    public String getmodel(){
        return model;
    }
    public void setmodel(String model){
        this.model=model;
    }
    public double getprice(){
        return price;
    }
    public void setprice(double price){
        this.price=price;
    }
    public double getfuelLevel(){
        return fuelLevel;
    }

    public void printDetails(){
    System.out.println("carmodel :"+model);
    System.out.println("Car price : "+price);
    System.out.println("Fuellevel"+fuelLevel);

    }
  


}
public class Qno2 {
    public static void main(String[] args) {
    Car car= new Car("hundai",2000000,20);
    car.printDetails();
    System.out.println();
    car.setmodel("Fortuner");
    car.setprice(29999999);
    System.out.println("Car model "+car.getmodel());
    System.out.println("Car price "+car.getprice());

    }
    
}
