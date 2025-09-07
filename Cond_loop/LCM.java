

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num1= input.nextInt();

        System.out.print("Enter the number : ");
        int num2= input.nextInt();


        // int result = findHCF(num1, findHCF(num2, num3));  :: For three numbers.

        int hcf= findhcf(num1,num2);
        int lcm=(num1*num2)/hcf;
        System.out.print("LCM of "+num1+" and "+num2+" is : "+lcm);
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
