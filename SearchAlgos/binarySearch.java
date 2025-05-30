package SearchAlgos;

public class binarySearch {
    public static int binSearch(int arr[], int n){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int index = binSearch(arr, 6);
        System.out.println("index: " +index);
    }
}
