

import java.util.Scanner ;
public class factorial {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int fact = 1;

        for(int i=1;i<=num;i++) { 
        
         fact *=i;
        //  System.out.println(" " +fact );
        }
        System.out.println(" " );
        System.out.println("Factorial : " +fact );


    }

}
