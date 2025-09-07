

import java.util.Scanner;

public class batting_avg {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

         System.out.print("Enter the run : ");
         int num1 = x.nextInt();

         System.out.print("Enter the inning : ");
         int  num2 = x.nextInt();

         System.out.print("Enter the inning not out : ");
         int  num3 = x.nextInt();

         int dismissal=num2-num3;
         int bat_avg;
         if(dismissal==0){
              bat_avg=num1;
         }else{
          bat_avg=num1/(dismissal);
         }
         System.out.println("Batting averagee : " +bat_avg);
        
    }   

}