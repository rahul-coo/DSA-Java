
    import java.util.Scanner;

    public class largest {
    public static void main(String[] args) {

        while(true){
         Scanner x = new Scanner(System.in);

         System.out.println(" ");


         System.out.print("Enter the no. : ");
         int num1 = x.nextInt();

         System.out.print("Enter the no. :");
         int  num2 = x.nextInt();


        //  while(true){
        //     int larg=num2;
        //     if(num1>num2){
        //        larg=num1;
        //     }
        //     System.out.println( +larg);
        //     break;
        //  }}}
   

         int larg=num2;

         if(num1>num2){
            larg=num1;
         }

         System.out.println( larg);


        }
}
    }