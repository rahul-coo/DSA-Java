
import java.util.Scanner;

public class avg_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double  avg=0;
        int count=0;
        int  sum = 0;


        while (true) { 
        System.out.print("Enter the num : ");
        String  num=input.nextLine();
        
        if(num.equals("=")){
            break;
        }
        sum+=Integer.parseInt(num);
        count++;
        avg=sum/count;
    }
        System.out.println("avg is : " +avg); 
    }
}