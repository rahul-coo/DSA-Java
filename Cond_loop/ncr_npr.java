import java.util.Scanner;
public class ncr_npr {
    public static long factorial(int num){
        long fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter the n : ");
        int n= input.nextInt();

        System.out.print("Enter the r : ");
        int r= input.nextInt();

        if(r>n){
            System.out.print("NOT possible");
        }else{
            long nCr =factorial(n)/(factorial(r)*factorial(n-r));
            long nPr =factorial(n)/factorial(n-r);

            System.out.println("NCR : "+nCr);

            System.out.println("NPR : "+nPr);
        }
        input.close();
        
    }
}
