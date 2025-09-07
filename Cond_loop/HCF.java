
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num1= input.nextInt();

        System.out.print("Enter the number : ");
        int num2= input.nextInt();

        int result= findhcf(num1,num2);
        System.out.print("Hcf of "+num1+" and "+num2+" is : "+result);
    }

    public static int findhcf(int a, int b){
        while (b!=0) { 
            int temp=b;
            b=a%b;
            a=temp;
            
        }
        return a;

    }
}