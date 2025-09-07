import java.util.Scanner;
public class area_circum_circle {
    public static double circumfrence(int r){
        return (2*(3.14)*r*r);
    }

    public static double area(int r){
        return ((3.14)*r*r);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int r=input.nextInt();

        double area=area(r);
        double circumfrence=circumfrence(r);

        System.out.println("Area :"+area);
        System.out.println("Circumfrence :"+circumfrence);
    }
    
}
