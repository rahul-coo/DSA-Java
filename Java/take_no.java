
import java.util.Scanner;

public class take_no {
    public static void main(String[] args) {

        Scanner to= new Scanner(System.in);
         int sum =0 ;

         while (true){
            System.out.print("ENTER NO : ");

            String  no = to.next();

            if(no.equals("=")){
                break;
            }
            sum += Integer.parseInt(no);
            }
            System.out.println("TOTAL SUM : " +sum) ;

         }
        
    }
    
