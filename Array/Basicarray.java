
import java.util.Scanner;
public class Basicarray {
    public static void main(String[] args) {
        
    int [] basicarray={1,2,3,4,5};
    for(int num:basicarray)
    
    System.out.print(" "+num+" ");   // " " we can use as the  spacing in result of continuous number
                // Above SOUT Print all the eliments of array. 
        System.out.println(" ");

        System.out.println("Enter the indexes : " );
        
        Scanner in=new Scanner(System.in);
        
        int i =in.nextInt();
        int j =in.nextInt();     // i can call any indises from array to sum them.

         int sum=basicarray[i]+basicarray[j];
         System.out.println("Sum = "+sum);

    }
}
