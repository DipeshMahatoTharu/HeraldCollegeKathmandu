/* Create an interface RemoteControl with methods powerOn() and powerOff().
 Implement this interface in classes TV and AC, which turn on and off their
 respective devices.*/ 
 interface RemoteControl{
    public void powerOn();
    public void powerOff();
 }
class TV implements RemoteControl{
    public void powerOn(){
        System.out.println("Tv is on");
    }
    public void powerOff(){
        System.out.println("Tv is turned off ");

    }
    
}
class Ac implements RemoteControl{
    public void powerOff(){
        System.out.println("ac is turn off");

    }
    public void powerOn(){
        System.out.println("Ac is power on !");
    }

}
public class Qno6 {
    public static void main(String[] args) {
    TV tv =new TV();
    tv.powerOn();
    tv.powerOff();

    Ac ac =new Ac();
    ac.powerOn();
    ac.powerOff();
    }

}
