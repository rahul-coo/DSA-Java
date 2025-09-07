import java.util.Scanner;
public class sum_of_kinds_of_no {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int sum_negative=0;
        int sum_odd=0;
        int sum_even=0;

        System.out.println("Enter the no : ");
        
        while (true) { 
            int num=input.nextInt();

            if(num==0){
                break;
            }

            if(num<0){
                sum_negative+=num;
            }
            else if(num%2==0){
                sum_even+=num;
            }
            else{
                sum_odd+=num;
            } 
        }
        System.out.println("Sum of Negative : "+sum_negative);
        System.out.println("Sum of Even : "+sum_even);
        System.out.println("Sum of Odd : "+sum_odd);
    }
}
