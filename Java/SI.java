
    import java.util.Scanner;
    
    public class SI {
        public static void main(String[] args) {
             Scanner x = new Scanner(System.in);
             System.out.print("Enter the principle : ");
             float p = x.nextInt();

             System.out.print("Enter the Intrest : ");
             float t = x.nextInt();

             System.out.print("Enter the Rate : ");
             float r = x.nextInt();

             float si=(p*r*t)/100;
             System.out.print("Simple interst : " +si);

        }   
    }
    
    

