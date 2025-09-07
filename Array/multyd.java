import java.util.Arrays;

public class multyd {
    public static void main(String[] args) {
        int[] nums={3,4,5,12};                              // original array
        System.out.println(Arrays.toString(nums));          // printing original array
        change(nums);                                       // calling change method or we can say function to change the array
        System.out.println(Arrays.toString(nums));          // change array will be printed 
    }
    static void change(int[] arr){                     // This is change function
        arr[0]=99;
    }
}
