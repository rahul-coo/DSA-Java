import java.util.Scanner;

public class future_invest {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("Enter the Investment amount : ");
        double inv_amount =input.nextDouble();

        System.out.print("Enter the Investment rate(in percentage) : ");
        double annual_inv_rate =input.nextDouble();

        System.out.print("Enter the Year : ");
        int years =input.nextInt();

        double monthly_intrest_rate = annual_inv_rate/1200;
        double future_investment_value = inv_amount * Math.pow(1+monthly_intrest_rate,years*12);

        System.out.print("Future investment value : " +future_investment_value);
        
    }    
}
