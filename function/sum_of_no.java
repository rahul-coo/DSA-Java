
import java.util.Scanner;

public class sum_of_no {
    public static int sum(int num1,int num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number1 : ");
        int num1=input.nextInt();

        System.out.print("Enter the number1 : ");
        int num2=input.nextInt();

        int result=sum(num1,num2);
        
        System.out.println("Sum of no "+num1+" and "+num2+" is : "+result);

    }

}
