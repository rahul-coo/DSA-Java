import java.util.Scanner;


public class palindrome_string{
    public static void main(String[] args) {

        
         Scanner x = new Scanner(System.in);

         System.out.print("Enter the string  : ");
         String input = x.next();

         String reversed = new StringBuilder(input).reverse().toString(); //reverse the string


         if(input.equalsIgnoreCase(reversed)){
            System.out.println("It is palindrone");
         }
         else{
            System.out.println("It is not Plindrone");
         }
}
}