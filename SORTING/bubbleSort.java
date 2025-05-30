public class bubbleSort {
    
    public static void BubbleSort(int arr[]) {
        for(int turn = 0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-turn-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }    

    public static void optimizedBubbleSort(int arr[]){
        for(int turn = 0; turn<arr.length-1; turn++){
            int swaps = 0;
            for(int j=0; j<arr.length-turn-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            System.out.println("Turn " + turn + ": " + swaps + " swaps");
            if(swaps == 0){
                return;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Bubble Sort Program");
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        optimizedBubbleSort(arr);
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}