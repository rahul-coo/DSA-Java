import java.util.Scanner;

public class larg_num_0 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number ;
        int lagr = Integer.MIN_VALUE; // Most important point to noted here

        System.out.print("Enter the no (Enter 0 to stop) : ");
        while (true) { 
            number = num.nextInt();
            if(number==0){
                break;
            }
            if(number > lagr){
                lagr=number;
            }
        }
        if(number==Integer.MIN_VALUE){
            System.out.println("No value is entered");
        }
        else{
            System.out.println("Largest no is : " +lagr);
        }
        
    }
    
}
