

import java.util.Scanner;

public class p_eq_tri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Radius : ");
        double side = input.nextInt();

        double perimeter = 4*side;
        System.out.println("Perimeter : " +perimeter);
    }
    
}
