    

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Height : ");
        double hight = input.nextInt();

        System.out.print("Enter the Base : ");
        double base = input.nextInt();

        double  area= 0.5 * base * hight;
        System.out.println("Area of circle  : " +area);
    }
}