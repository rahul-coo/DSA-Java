
import java.util.Scanner;

public class intrest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter the principal : ");
        double p=input.nextDouble();

        System.out.print("Enter the rate : ");
        double r=input.nextDouble();

        System.out.print("Enter the time : ");
        double t=input.nextDouble();

        double amount= p * Math.pow(1+(r/100),t);
        double Cpompound_intrest=amount-p;

        System.out.println("Amount : "+amount);
        System.out.print("compound Intrest : "+Cpompound_intrest);
    }
    
}
