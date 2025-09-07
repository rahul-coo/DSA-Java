
import java.util.Scanner;

public class area_circle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Radius : ");
        double rad = input.nextInt();

        double area = (3.14)*rad*rad;
        System.out.println("Area of circle  : " +area);
    }
}