package geeksforGeeks;

import java.util.Arrays;

public class GameWithNos {
    public static int[] game_with_number (int arr[], int n) {
        int[] array = new int[n];
        for (int i=0 ;i<n-1 ;i++){
            int result = arr[i] ^arr[i+1];
            array[i] = result;
        }
        array[n-1] = arr[n-1];
        System.out.println(Arrays.toString(array));
        return arr;
    }
    public static void main(String[] args) {
        int[] array = {5, 9, 7, 6};
        game_with_number(array,array.length);
        System.out.println(10^11);
    }
}
