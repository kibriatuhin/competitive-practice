package geeksforGeeks;

import java.util.Arrays;

public class SwapKTH {
    static void swapKth(int arr[], int n, int k) {
        int temp = arr[k-1];
        arr[k-1] = arr[n-k];
        arr[n-k] = temp;
        //System.out.println(Arrays.toString(arr));
     }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
         swapKth(array,array.length,3);
    }
}
