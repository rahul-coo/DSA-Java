
    import java.util.Arrays;
    import java.util.Scanner;
    
    public class swap_user_define {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
    
            // Taking the size of the array
            System.out.print("Enter the size of the array: ");
            int size = in.nextInt();
    
            int[] arr = new int[size]; // Since size alloted Now we can add element to It .
    
            // Taking the elements of the array
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println("Original array :"+ Arrays.toString(arr)); // This code for Original Array.

    
            // Taking the indices to be swapped
            System.out.print("Enter the first index to swap: ");
            int index1 = in.nextInt();
    
            System.out.print("Enter the second index to swap: ");
            int index2 = in.nextInt();
    
            // Swapping and printing the result
            swap(arr, index1, index2);
            System.out.println("Array after swapping: " + Arrays.toString(arr));
        }
    
        static void swap(int[] arr, int index1, int index2) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
    }
    
