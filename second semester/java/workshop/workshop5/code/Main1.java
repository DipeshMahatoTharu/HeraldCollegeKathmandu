
abstract class  Vehicle{
	void door() {
		int door=1;
		System.out.println("Vehicles have:"+door+" "+"door");
	}
abstract void wheel();
}
class Bus extends Vehicle{
	@Override
	void wheel() {
		int wheel=1;
		System.out.println("Buses have:"+wheel+" "+"wheels.");
		
	}
}
public class Main1 {

	public static void main(String[] args) {
		Bus b=new Bus();
		b.door();
		b.wheel();

	}

}
