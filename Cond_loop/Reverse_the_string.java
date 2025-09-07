
import java.util.Scanner;



public class Reverse_the_string {
    public static void main(String[] args) {
        Scanner data =new Scanner(System.in);
        
        System.err.print("Enter the string : ");
    String input =data.next();
    String rev=" ";
    for(int i=input.length()-1;i>=0;i--){
         rev+=input.charAt(i);
    }

    System.out.println("Reversed String : "+rev);
    
}
}