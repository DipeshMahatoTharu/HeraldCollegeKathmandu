/*Create multiple Person objects using different constructors and
 print their details */
 class Person {

    String name;
    int age;
    String address;
    public Person(String name,String address,int age ){
        this.name=name;
        this.address=address;
        this.age=age;
        
    }
    public void printDetail(){
       System.out.print("My name is : "+ name +", age is : "+ age+ ", I live in : "+address +"\n");
    }

 
    
 }
public class Qno15 {
    public static void main(String[] args) {
        Person person1 =new Person("Dipesh","Kalopul",25);
        Person person2 =new Person("sda","Patan",26);
        Person person3 =new Person("patato","kamalpokhari",2);
        Person person4 =new Person("bepo","kamalpokhari",1);
    
        person1.printDetail();
        person2.printDetail();
        person3.printDetail();
        person4.printDetail();
        

    }
    
}
