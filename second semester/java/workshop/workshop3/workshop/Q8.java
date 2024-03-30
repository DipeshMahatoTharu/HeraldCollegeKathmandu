public class Q8 {
boolean isOn;
Q8(){
    isOn = false;
}
void turnOn(){
    isOn = true;
    System.out.println("Lamp is turned On");
}
void turnOff(){
    isOn = false;
    System.out.println("Lamp is turned off");

}
void printStatus() {
    if (isOn) {
        System.out.println("Lamp is on.");
    } else {
        System.out.println("Lamp is off.");
    }
}
public static void main(String[] args) {
    Q8 lamp = new Q8();
    lamp.turnOn();
    lamp.printStatus();
    lamp.turnOff();
    lamp.printStatus();
}
}
