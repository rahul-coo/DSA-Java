
import java.util.Scanner;

public class grade {
    public static String grade(int marks){
        if(marks>90 && marks<=100){
            return "AA";
        }
        else if(marks>80 && marks<=90){
            return "AB";
        }
        else if(marks>70 && marks<=80){
            return "BB";
        }
        else if(marks>60 && marks<=70){
            return "BC";
        }
        else if(marks>50 && marks<=60){
            return "CD";
        }
        else if(marks>40 && marks<=50){
            return "DD";
        }else{
            return "Fail";
        }
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter the marks : ");
        int marks=input.nextInt();

        String grade =grade(marks);
        System.out.println("Students grade : "+grade);
    }
    
}
