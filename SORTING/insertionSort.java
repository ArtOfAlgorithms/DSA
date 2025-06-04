public class insertionSort {

    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i--;
                }
                else break;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
