
import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
         Scanner x = new Scanner(System.in);

         while(true){ //while loop is here to take input from  user again and again
         
            System.out.println(" ");

         System.out.print("Enter the no. : ");
         int num1 = x.nextInt();

         System.out.print("Enter the no. :");
         int  num2 = x.nextInt();


        //  if (num2!=Integer.BYTES){
        //     System.out.println("wrong input");
        //  }
        

         System.out.print("Choose operator :");
         String p = x.next();

         System.out.println(" ");

         if (p.equals("+")){
            System.out.println("Sum :" +(num1+num2));
         }
         else if (p.equals("-")){
            System.out.println("Sum :" +(num1-num2));
         }
         else if (p.equals("*")){
            System.out.println("Sum :" +(num1*num2));
         }
         else if (p.equals("/")){
            System.out.println("Sum :" +(num1/num2));
         }
         else if (p.equals("%")){
            System.out.println("Sum :" +(num1%num2));
         }
         else{
            System.out.print("Wrong Operator");
         }


        }
    }   
}


    

