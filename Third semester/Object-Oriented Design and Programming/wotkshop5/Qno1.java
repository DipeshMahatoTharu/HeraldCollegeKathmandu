package wotkshop5;

public class Qno1 {
    public static void main(String[] args) {
        String original = "Batman";
        String reversed = new StringBuilder(original).reverse().toString();

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
