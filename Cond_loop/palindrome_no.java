import java.util.Scanner;

public class palindrome_no {
    

    public static void main(String[] args) {
        Scanner data =new Scanner(System.in);
        
    System.out.print("Enter the number : ");
    int num=data.nextInt();
    int rev=0,original=num;

    while(num!=0){
    int digit=num%10;
    rev=rev*10+digit;
    num/=10;
    }


    if (original == rev) {
        System.out.println(original + " is a palindrome.");
    } else {
        System.out.println(original + " is not a palindrome.");
    }
}
}