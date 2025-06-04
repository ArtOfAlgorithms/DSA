public class staircaseSearch {

    public static void staircaseSearch(int matrix[][], int key){
        int i=0;
        int j=matrix.length-1;
        while(i<matrix.length && j>=0){
            if(matrix[i][j] < key){
                i++;
            }
            else if(matrix[i][j] > key){
                j--;
            }
            else if(matrix[i][j] == key){
                System.out.println("Key found at (" + i + "," + j + ")");
                return;
            }
        }
        System.out.println("Key not found");
    }
    public static void main(String[] args) {
        int matrix [][] = {{1,2,3,4}, 
                           {5,6,7,8}, 
                           {9,10,11,12}, 
                           {13,14,15,16}};
        staircaseSearch(matrix, 16);
    }
}
