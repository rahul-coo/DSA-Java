import java.util.Scanner;

public class electric_bill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");

        int unit= input.nextInt();

        if(unit<=100){
            System.out.println(unit*.10);
        }

        else if(unit<=200){
            System.out.println(((100)*.10)+((unit-100)*.20));
        }   
        else {
            System.out.println(((100)*.10)+((200)*.20)+((unit-200)*.30));
        }   
    }
}
