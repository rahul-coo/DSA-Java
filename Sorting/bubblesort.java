import java.util.Arrays;

 class bubblesort{
    public static void main(String[] args){
        int[] arr={5,3,4,1,2};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubblesort(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped =false;
            for(int j=1;j<arr.length;j++){
                if(arr[j]<arr[j-1]){

                    // swapp
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped =true;

                }
            }

            if (!swapped){
                break;
            }
        }
    }
}
