/*Task 8:
Create a subclass B that inherits from A and overrides display() to print
"Class B".
*/
class B extends A {
        @Override
        public void display() {
            super.display();
            System.out.println("shuuuuui");
        }
    
}

public class Task8 {
    public static void main(String[] args) {
    B b =new B();
    b.display();
}    
}
