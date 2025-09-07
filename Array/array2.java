public class array2 {
    public static void main(String[] args) {
        
        int[] array= new int [5]; //declaring an array of size 5 
        for (int i=0;i<array.length;i++){
            // int array=i*2; wrong apprach 
            array[i]=i*2;                         // Here we are declaring  the value to an aray dynamicllay .
        }   // if you remove this ( } ) bracket you will get intresting output 
            for(int num :array){         //remove this one also 
            System.out.println(num);
        }
    }
    
}
