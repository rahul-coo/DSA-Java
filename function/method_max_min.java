
import java.util.Scanner;



public class method_max_min {
   
    public static int findgreatest(int num1,int num2,int num3){
        int greater=num1;
        if(num2>greater){
            greater=num2;
        }
        if(num3>greater){
            greater=num3;
        }
        return greater;
    }               
        // individual function variable is diferent from each other { even name of variable is same }

    public static int findsmallest(int num1,int num2,int num3){
        int greater=num1;
        if(num2<greater){
            greater=num2;
        }
        if(num3<greater){
            greater=num3;
        }
        return greater;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter he number 1 : ");
        int num1=input.nextInt();

        System.out.print("Enter he number 2 : ");
        int num2=input.nextInt();

        System.out.print("Enter he number 3 : ");
        int num3=input.nextInt();

        int largest = findgreatest( num1, num2, num3);
        int smallest = findsmallest( num1, num2, num3);

        System.out.println("Largest numeber : "+largest);
        System.out.println("Smallest  numeber : "+smallest);

    }
}

