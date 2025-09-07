import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner num  = new Scanner(System.in);
        
        System.out.print("Enter the amount : ");
        int amount=num.nextInt();

        System.out.print("Enter the discount : ");
        int dis=num.nextInt();

        float discount=(amount-(amount*(dis)/100));
        System.out.print("Discounted price is : " +discount);
    }

    
}
