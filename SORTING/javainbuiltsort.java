import java.util.Arrays;
import java.util.Collections;

public class javainbuiltsort {
    public static void main(String[] args) {
        Integer[] arr = {64, 34, 25, 12, 22, 11, 90};
        //Arrays.sort(arr, 0, 5);
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
