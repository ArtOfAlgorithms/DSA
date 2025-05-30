public class subArrays {

    public static void printSubArrays(int arr[], int l){
        int ts=0;
        int maxSum = 0;
        for(int i=0; i<l; i++){
            int start = i;
            for(int j=i+1; j<l; j++){
                int end = j;
                int sum = 0;
                for(int k=start; k<end; k++){
                    sum += arr[k];
                    if(sum>maxSum){
                        maxSum = sum;
                    }
                    ts++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max Sum = " + maxSum);
        System.out.println("Total Subarrays = " + ts);
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int l=5;
        printSubArrays(arr, l);
    }
}
