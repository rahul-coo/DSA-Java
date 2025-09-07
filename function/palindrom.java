import java.util.Scanner;
public class palindrom {
    public static boolean palin(int num){
        int original=num;
        int reverse=0;
        while(num!=0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num/=10;
        }
        return reverse==original ; //Main function condition is written in the plulic class (return) type

    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num=input.nextInt();

        if(palin(num)){
            System.out.println("It is palindrom number");
        }else{
            System.out.println("It is not a palindrom number");
        }
    }
}
