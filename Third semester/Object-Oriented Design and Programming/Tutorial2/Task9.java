/*Task 9: 
Create another subclass C that inherits 
from B and overrides display() to print "Class C".
*/ 
// multilevel (child having child )
class C extends B{
    @Override
    public void display(){
        super.display();
        System.out.println("Class C");
    }
} 

public class Task9 {
    public static void main(String[] args) {
       C c=new C();
       c.display(); 
    }
}
