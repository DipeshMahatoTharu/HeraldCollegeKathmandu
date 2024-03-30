
public class Q15 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int[] age = {10, 20, 25, 24, 28, 27, 30, 31, 32};

        try {
            System.out.println(age[9]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
    
        }
    }
}
