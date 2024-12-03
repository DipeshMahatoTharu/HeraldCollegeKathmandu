// Final class and methods
final class FinalClass {
   public void showMessage() {
       System.out.println("This is a final class.");
   }
}



class ParentWithFinalMethod {
   public void display() {
       System.out.println("This is a regular method.");
   }

   public final void finalDisplay() {
       System.out.println("This is a final method and cannot be overridden.");
   }
}

class ChildAttemptOverride extends ParentWithFinalMethod {
   @Override
   public void display() {
       System.out.println("Overriding the regular method.");
   }

   // Uncommenting this will cause a compiler error:
   // @Override
   // public void finalDisplay() {
   //     System.out.println("Trying to override final method.");
   // }
}


class Parent {
   private String variable1; 
   protected int variable2;  
   public double variable3;  

   public Parent(String variable1, int variable2, double variable3) {
       this.variable1 = variable1;
       this.variable2 = variable2;
       this.variable3 = variable3;
   }

   // Getter for private variable
   public String getVariable1() {
       return variable1;
   }
}

class Child extends Parent {
   public Child(String variable1, int variable2, double variable3) {
       super(variable1, variable2, variable3);
   }

   public void result() {
       // Cannot access variable1 directly (private)
       System.out.println("The private variable is accessed through a getter: " + getVariable1());
       System.out.println("The protected variable is: " + variable2);
       System.out.println("The public variable is: " + variable3);
   }
}

public class Qno5 {
   public static void main(String[] args) {
     
       FinalClass finalClass = new FinalClass();
       finalClass.showMessage();

       ParentWithFinalMethod parent = new ParentWithFinalMethod();
       parent.display();
       parent.finalDisplay();

       ChildAttemptOverride childAttempt = new ChildAttemptOverride();
       childAttempt.display();

 
       Child child = new Child("PrivateValue", 21, 2112.0);
       child.result();
   }
}
