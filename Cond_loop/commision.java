import java.util.Scanner;

public class commision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount : ");
        double amount = input.nextDouble();

        System.out.print("Enter the commision : ");
        double commis = input.nextDouble();

        double commmission=(amount*commis)/100;
        System.out.println("Commision : "+commmission);
    }
    
}
