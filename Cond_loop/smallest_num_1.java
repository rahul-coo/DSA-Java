    import java.util.Scanner;

    public class smallest_num_1 {
        public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number ;
        int small = Integer.MAX_VALUE; // Most important point to noted here

        System.out.print("Enter the no (Enter 1 to stop) : ");
        while (true) { 
            number = num.nextInt();
            if(number==1){
                break;
            }
            if(number < small){
                small=number;
            }
        }
        if(number==Integer.MIN_VALUE){
            System.out.println("No value is entered");
        }
        else{
            System.out.println("Smalest no is : " +small);
        }
        num.close();
        
    }
    
}

    

