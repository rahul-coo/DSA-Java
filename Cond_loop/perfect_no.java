import java.util.Scanner;
public class perfect_no {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the no : ");
        int num=input.nextInt();
        int fact=0;

        for(int i=1;i<num;i++){
            if(num%i==0){
                fact=fact+i;
            }
        }
         if(fact==num){
            System.out.print(num+" is Perfect number");
    }
    else{
        System.out.println(num+" is not a Perfect number");
    }
}
}
