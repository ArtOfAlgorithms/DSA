// package ARRAYS;
public class reverseArray {
    public static void revArray(int arr[], int length){
        int first = 0;
        int last = length-1;
        int temp=0;
        while(first<last){
            temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int length = arr.length;
        revArray(arr, length);
        for(int i=0; i<length; i++){        
            System.out.print(arr[i] + " ");
        }
    }
    
}
