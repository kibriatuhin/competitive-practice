package geeksforGeeks;

import java.util.Arrays;

public class MaximizeSum {
    static int Maximize(int arr[], int n)
    {
        Arrays.sort(arr);
        int sum =0;
        for (int i=0 ;i<n ; i++){
            sum +=(arr[i]*i);
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 2, 4, 1};
        Maximize(array,array.length);
    }
}
