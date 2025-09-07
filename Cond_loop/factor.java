



import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        
        
         Scanner x = new Scanner(System.in);

         System.out.print("Enter the no. : ");
         int num = x.nextInt();

         for(int i=1;i<=num;i++){
            if(num%i==0)
            System.out.println("Factor : " +i );
         }
    }   
}
