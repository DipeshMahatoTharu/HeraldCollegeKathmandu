// 4. Write a program to calculate the area of a triangle.
// Where s is the semi-perimeter of the triangle s = (a+b+c)/2
public class Qno4 {
    public static void main(String[] args) {
      int area,semi,a,b,c;

      a=2;
      b=43;
      c=5;

      semi=(a+b+c)/2;

      area=(int)Math.sqrt(semi*(semi-a)*(semi-b)*(semi-c));
      System.out.println("Area is :" + area);

    }
    
}
