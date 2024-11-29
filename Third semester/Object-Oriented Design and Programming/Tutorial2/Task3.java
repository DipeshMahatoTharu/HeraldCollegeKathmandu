/*
How is Code Reuse Achieved Through Inheritance?
Inheritance is a key feature of Object-Oriented Programming (OOP) that allows a class (child class or subclass)
to inherit properties and behaviors
(methods and fields) from another class (parent class or superclass). 
Code reuse through inheritance is achieved because the child class can directly use the code
 written in the parent class without redefining it. 
This reduces redundancy and improves maintainability.

Why Does Java Not Support Multiple Inheritance?
Java does not support multiple inheritance with classes to avoid ambiguity and complexity caused by the Diamond Problem.

The Diamond Problem:
Consider two parent classes, A and B, both having a method with the same signature. 
If a child class C inherits from both A and B, it becomes unclear which version of the method C should inherit.

*/ 

// Define a class Person with attributes name and age.

class Person{
    String name;
    int age;

}
public class Task3 {

    public static void main(String[] args) {
        
        Person person =new Person();
        person.name="Dipesh";
        person.age=21;
        System.out.println(person.name);
        System.out.println(person.age);

    }
}