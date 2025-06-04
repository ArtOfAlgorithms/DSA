public class findTranspose {

    public static int[][] findTranspose(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        int transpose[][] = new int[m][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                transpose[j][i] = matrix [i][j];
            }
        }
        return transpose;
    }
    public static void main(String[] args) {
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} }; 
        int numsTranspose[][] = findTranspose(nums);
        for(int i=0; i<numsTranspose.length; i++){
            for(int j=0; j<numsTranspose[0].length; j++){
                System.out.print(numsTranspose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
