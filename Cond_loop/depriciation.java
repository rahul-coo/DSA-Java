    
import java.util.Scanner;

 public class depriciation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter the initial value of the asset: ");
        double initialValue = scanner.nextDouble();
        
        System.out.print("Enter the salvage value of the asset: ");
        double salvageValue = scanner.nextDouble();
        
        System.out.print("Enter the useful life of the asset (in years): ");
        int usefulLife = scanner.nextInt();
        
        // Calculate depreciation per year
        double depreciation = (initialValue - salvageValue) / usefulLife;
        
        // Display results
        System.out.println("Annual Depreciation: $" + depreciation);
        
        // Show depreciation table for each year
        System.out.println("\nYear-wise Depreciation Schedule:");
        double currentValue = initialValue;
        for (int year = 1; year <= usefulLife; year++) {
            currentValue -= depreciation;
            System.out.println("Year " + year + ": $" + currentValue);
        }
        scanner.close();
    }
}
