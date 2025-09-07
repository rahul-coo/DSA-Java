    
import java.util.Scanner;

public class Right_to_vote {
    public static String vote(int age){

    if(age>=18){
        return "Eligible";  
    }else{
        return "Not eligible";
    }
}

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter the number : ");
        int age=input.nextInt();

        String result=vote(age);

        System.out.println("Your age is " +age+ " and  : "+result+ " to vote ");
    }
}
