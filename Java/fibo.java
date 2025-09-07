import java.util.Scanner;


public class fibo {
    public static void main(String[] args) {

        while(true){ //for continuous running of code

            System.out.println(" ");

        System.out.print("Enter the nth term : ");

         Scanner x = new Scanner(System.in);
         int n=x.nextInt();

         int ft=0;
         int st=1;
         for (int i =0; i < n; i++) {
            System.out.print(ft +" ");
            int nt=ft+st;
            ft=st;
            st=nt;

         }
        }
    }
}

        
    

