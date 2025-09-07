import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        
    Scanner x = new Scanner(System.in);
    System.out.print("Enter the no : ");

        double num1 = x.nextInt();
        double power =Math.pow(num1,2);
        System.out.println("POwer : "+power);

    }
}
