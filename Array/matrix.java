public class matrix {
    public static void main(String[] args) {
        int[][] matrix={ {1,2,3} , {4,5,6} , {7,8,9} };
    
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){ // matrix[i] is size of that row in array 
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println(" ");
        }
    }
}