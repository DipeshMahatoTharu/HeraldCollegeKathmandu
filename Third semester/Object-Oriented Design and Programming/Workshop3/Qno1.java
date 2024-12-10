/*Encapsulation
 
Create a class Student with private fields id, name, age, and grade(A, B, C, D, E,
F). Provide getter and setter methods to access and modify these fields.*/ 
class Student{
    private int id;
    private String name;
    private int age;
    private String grade;

    public Student(int id,String name,int age,String grade){
        this.id=id;
        this.grade=grade;
        this.name=name;
        this.age=age;


    }

    public int getid(){
        return id;

    }
    public void setid(int id){
        this.id=id;
    }

    public String getgrade(){
        return grade;

    }
    public void setgrade(String grade){
        this.grade=grade;
    }
    public String getname(){
        return name;

    }
    public void setname(String name){
        this.name=name;
    }
    public int getage(){
        return age;


    }
    public void setage(int age){
        this.age=age;
    }

    
}
public class Qno1 {
    public static void main(String[] args) {
      Student student=new Student(1, "Dipesh", 21, "B");
      System.out.println("The id  is :"+student.getid());
      System.out.println("The name is :"+student.getname());
      System.out.println("The age is :"+student.getage());
      System.out.println("The Grade is : "+ student.getgrade());
      
      

    }
   
    
} 