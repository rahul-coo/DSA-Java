import java.util.Arrays;

public class search_in_2D {
    
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},           // 0 [ Indexing ]
                {18, 12, 3, 9},       // 1
                {78, 99, 34, 56},     // 2
                {18, 12}              // 3
        };
        int target = 56;
        int[] ans = search(arr,target); // format of return value {row, col}
        System.out.println(Arrays.toString(ans));   // To use [ Array. ]  we need to import it from the libraray.

        // System.out.println(max(arr)); 

        // System.out.println(Integer.MIN_VALUE);
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
