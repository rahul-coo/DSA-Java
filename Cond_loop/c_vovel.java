import java.util.Scanner;
public class c_vovel {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter the  alphabets : ");
        char ch=input.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u' ){
        System.out.println("Chracter is  vovels");
        }else {
            System.err.println("It is consonants");
        }

    }
    
}
