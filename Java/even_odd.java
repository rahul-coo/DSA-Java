import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        
         while (true) { 
            System.out.print("ENTER NO : ");

         int num1 = n.nextInt();
             
         if (num1%2==0){
            System.out.println(+num1 +" is " +"Even No.");
            System.out.println(" ");
         }
            else{
                System.out.println(+num1 +" is " +"Odd No.");
            }
        }
    }
}
