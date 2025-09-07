


public class linear_search{
    public static void main(String[] args) {
        int [] nums={23,45,1,2,8,19,-3,16,-11,28};
        int target =19;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    static int linearSearch(int[] arr, int target){

        // One of the other condition in loop.
        if (arr.length == 0){
            return -1;
        }
        // loop of the program
        for (int index=0; index < arr.length;index++){
            int element = arr[index];   // arr[index] : give us element of that index.
            if(element == target){
                return index; 
             }
        }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        //this will run if all above return statement don't get executed.


        return -1;
    }
}
