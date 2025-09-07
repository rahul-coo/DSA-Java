import java.util.Scanner;
public class prime {
    public static boolean prime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        } 
        return true;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num=input.nextInt();

        if(prime(num)){
            System.out.println("It is prime number");
        }else{
            System.out.println("It is not a prime number");
        }
    }
}
