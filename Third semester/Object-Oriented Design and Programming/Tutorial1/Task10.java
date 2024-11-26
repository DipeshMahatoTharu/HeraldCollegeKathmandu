//  °F = (°C × 9/5) + 32
import java.util.Scanner;

class Calculate{
    public float CelsiusTofar( float Celsius){
        return(Celsius * 9/5f)+32;
    }

}
public class Task10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the Celsius :");
        float Celsius =sc.nextFloat();

        Calculate celTofer=new Calculate();

        System.out.println("Conversion is :" +celTofer.CelsiusTofar(Celsius));

        sc.close();
        }

}
