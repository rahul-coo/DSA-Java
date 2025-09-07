
import java.util.Scanner;

public class area_rect {   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length : ");
        double length = input.nextInt();

        System.out.print("Enter the Breadth : ");
        double breadth = input.nextInt();

        double  area=  length * breadth;
        System.out.println("Area of circle  : " +area);
    }
}