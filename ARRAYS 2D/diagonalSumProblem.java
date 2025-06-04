public class diagonalSumProblem {

    public static void printDiagonalSum(int matrix[][]) {
        int sum = 0;
        if(matrix.length%2 == 0){
            // for(int i=0; i<matrix.length; i++){
            //     for(int j=0; j<matrix[0].length; j++){
            //         if(i == j){
            //             sum += matrix[i][j];
            //         }
            //         if(i+j == matrix.length-1){
            //             sum += matrix[i][j];
            //         }
            //     }
            // }
            // System.out.println(sum);

            for(int i=0; i<matrix.length; i++){
                sum += matrix[i][i];
                sum += matrix[i][matrix.length-i-1];
            }
            System.out.println(sum);
        }
        else{
            // for(int i=0; i<matrix.length; i++){
            //     for(int j=0; j<matrix[0].length; j++){
            //         if(i == j){
            //             sum += matrix[i][j];
            //         }
            //         if(i+j == 3){
            //             sum += matrix[i][j];
            //         }
            //     }
            // }
            // sum -= matrix[matrix.length/2][matrix.length/2];
            // System.out.println(sum);

            for(int i=0; i<matrix.length; i++){
                sum += matrix[i][i];
                if(i != (matrix.length - i)/2){
                    sum += matrix[i][matrix.length-i-1];
                }
            }
            
            // sum -= matrix[matrix.length/2][matrix.length/2];
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        int matrix [][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        printDiagonalSum(matrix);
    }
}
