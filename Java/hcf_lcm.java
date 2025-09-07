  

import java.util.Scanner;

public class hcf_lcm{
  
 public static void main(String[] args) {
    Scanner ur = new Scanner(System.in);


    System.out.print("Enter the no1 : ");
    int num1 = ur.nextInt();

    System.out.print("Enter the no2 : ");
    int num2 = ur.nextInt();

    int hcf = findHCF(num1,num2);


    int lcm = (num1*num2)/hcf ;

    System.out.println("HCF OF NO : " +hcf);
    System.out.println("LCM OF NO : " +lcm);


 }
    public static int findHCF(int a, int b) {
      while (b != 0) {
          int temp = b;
          b = a % b;
          a = temp;
      }
      return a;

 }
        
}
