/* Question : Use the following sorting algorithms to sort an array in DESCENDING order :
a.Bubble Sort
b.Selection Sort
c.Insertion Sort
d.Counting Sort
You can use this array as an example :[3,6,2,1,8,7,4,5,3,1] 
*/

import java.util.*;

public class sortingPracticeQuestion {

    public static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[]){
        for(int turn = 0; turn <arr.length - 1; turn++){
            for(int j=turn+1; j<arr.length; j++){
                if(arr[turn]<arr[j]){
                    int temp = arr[turn];
                    arr[turn] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int maxPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[maxPos]){
                    maxPos = j;
                } 
            }
            int temp = arr[i];
            arr[i] = arr[maxPos];
            arr[maxPos] = temp;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void countingSort(int arr[]){
        int highest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>highest){
                highest = arr[i];
            }
        }
        int[] count = new int[highest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=count.length-1; i>=0; i--){
            while(count[i] != 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1}; 
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSort(arr);
        printarray(arr);
    }
}