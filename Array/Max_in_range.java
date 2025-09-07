    public class Max_in_range{
        public static void main(String[] args) {
            int [] arr={1,2,3,4,5};
            System.out.println(maxrange(arr,1,3));
        }
        static int maxrange(int[] arr, int start, int end){
        int maxval= arr[start];
        for(int i=start ; i < end ; i++){
            if( arr[i] > maxval ){
                maxval = arr[i];
            }
        }
        return maxval;
    }
    }

