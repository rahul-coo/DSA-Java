import java.util.Scanner;

public class perimeter_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Radius : ");
        double rad = input.nextInt();

        double perimeter = 2*3.14*rad;
        System.out.println("perimeter of circle  : " +perimeter);
    }
    
}
