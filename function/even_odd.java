
import java.util.Scanner;

public class even_odd {
    public static String find(int num){

    if(num%2==0){
        return "even";  
    }else{
        return "odd";
    }
}

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num=input.nextInt();

        String result=find(num);

        System.out.println("Number " +num+ " is : "+result);
    }
}
