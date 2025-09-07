import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter the no of subject : ");
        double subject=input.nextDouble();
        double total_grade=0;

        for (int i = 1; i <= subject; i++) {
            System.out.print("Enter the gerade of the subject "+i+ " : ");

             double grade=input.nextDouble();
             total_grade+=grade;
            
        }
        double cgpa=total_grade/subject;
        System.out.println("CGPA : "+cgpa);
    }
}