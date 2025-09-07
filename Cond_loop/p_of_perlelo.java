

import java.util.Scanner;

public class p_of_perlelo {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Radius : ");
        double length = input.nextInt();

        System.out.print("Enter the Radius : ");
        double breadth = input.nextInt();

        double perimeter = 2*(length + breadth);
        System.out.println("Perimeter : " +perimeter);
    }
    
}
