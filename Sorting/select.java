
import java.util.Arrays;

 class selection {
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        selections(arr);
        System.out.println(Arrays.toString(arr));
    }


static void selections(int [] arr){
    for(int i=0;i<arr.length;i++){
        int last=arr.length-i-1;  // this is pass number.
        int maxIndex=getMax(arr,0,last);
        swap(arr, maxIndex,last);
    }
}


static void swap(int[] arr, int first, int second){
    int temp= arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
}


static int getMax(int arr[],int start, int end){
    int max=start;
    for(int i=start;i<=end;i++){
        if(arr[max]<arr[i]){
            max=i;
        }
    }
    return max;
    
    }   
}
