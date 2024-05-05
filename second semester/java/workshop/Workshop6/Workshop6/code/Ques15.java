//Write a Java program to check whether a string contains only a certain set of characters (in this case a-z, A-Z and 0-9).
public class Ques15 {
    public static void main(String[] args) {
       
        String str1 = "Abc123";
        String str2 = "Abc@123"; 

    
        boolean containsOnlyAlphanumeric1 = str1.matches("[a-zA-Z0-9]+");
        System.out.println("Does \"" + str1 + "\" contain only a-zA-Z0-9? " + containsOnlyAlphanumeric1);

   
        boolean containsOnlyAlphanumeric2 = str2.matches("[a-zA-Z0-9]+");
        System.out.println("Does \"" + str2 + "\" contain only a-zA-Z0-9? " + containsOnlyAlphanumeric2);
    }
}
