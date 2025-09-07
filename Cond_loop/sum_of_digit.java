
import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;

        System.out.print("enter the number : ");
        int num=input.nextInt(); //645

        while(num>0){
            int digit=num%10;  //getting the last digit
            sum+=digit; // adding the last digit
            num=num/10; // removing last digit
        }
        System.out.print("Sum of digit : "+sum);
    }
}