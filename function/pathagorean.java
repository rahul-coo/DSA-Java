import java .util.Scanner;
public class pathagorean {
    public static boolean  path(int a,int b,int c){
        int x=a*a;
        int y=b*b;
        int z=c*c;
        return (x==y+z)|| (y==x+z)||(z==x+y);

    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter the number a : ");
        int a=input.nextInt();

        System.out.print("Enter the number b : ");
        int b=input.nextInt();

        System.out.print("Enter the number c : ");
        int c=input.nextInt();

        if(path(a, b, c)){
            System.out.println("Yes It is pathagores triplet");
        }else{
            System.out.println("Not");
        }
    }
    
}
