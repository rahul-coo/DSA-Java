import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        // Volume of CONE :
        // Scanner input = new Scanner(System.in);

        // System.out.print("Enter the Radius : ");
        // double rad = input.nextInt();

        // System.out.print("Enter the Hight : ");
        // double hig = input.nextInt();

        // double v = 0.34 * 3.14 * rad*rad*hig;
        // System.out.println("Volume : " +v);



        // Volume Of Prism :
        // System.out.print("Enter the Radius : ");
        // double bridth = input.nextInt();

        // System.out.print("Enter the Hight : ");
        // double height = input.nextInt();

        // double v = bridth+height;
        // System.out.println("Volume : " +v);



        // Volume of cylinde :
        // System.out.print("Enter the Radius : ");
        // double rad = input.nextInt();

        // System.out.print("Enter the Hight : ");
        // double height = input.nextInt();

        // double v = 3.14*rad*rad*height;
        // System.out.println("Volume : " +v);



        // Volume of Sphere :
        // System.out.print("Enter the Radius : ");
        // double rad = input.nextInt();

        // double v = 1.34*rad*rad*rad;
        // System.out.println("Volume : " +v);


        
        //Volume of Pyramid :
        System.out.print("Enter the Base : ");
        double base = input.nextInt();

        System.out.print("Enter the Hight : ");
        double height = input.nextInt();

        double v = 0.34*base*height;
        System.out.println("Volume : " +v);


        //Curved surfac are of th cyliner : 2*pi*r*h 
        //Total curved surface area of cube : 6a*a

    }
    
}
