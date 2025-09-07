

import java.util.Scanner;

public class armstrong{
    public static void main(String[] args) {
         Scanner y = new Scanner(System.in);
         System.out.print("Enter the three digit no. : ");
         int num = y.nextInt();
         int original_no = num;
         int sum=0;
         

         while(num >0){
         int digit = num%10;
         sum = sum + digit*digit*digit ;
         num/=10; //num=num/10

         }

         if (sum==original_no){
            System.out.println("Armstrong no");
         }
         else{
            System.out .println("Not a armstrong no");
         }   
      
        }
    }   



// import java.util.Scanner;
// public class armstrong{
//     public static void main(String[] args) {
//          Scanner y = new Scanner(System.in);
//          System.out.print("Enter the no. : ");
//          int num = y.nextInt();
//          int org=num;
//          int sum = 0;
//          while(num>0){

//          int x= num%10;
//         //  int r=x*x*x;
//          sum=sum+ x*x*x;;
//          num = num/10;        //while loop yahi tak rakho nhi to bar bar print ho jai ja output , use " } " .
//          if (sum==org){
//             System.out.println("Armstrong no");
//          }
//          else{
//             System.out.println("Not a armstrong");
//          }         
//         }
//     }   
// }




