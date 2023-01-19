package geeksforGeeks;

import java.util.Arrays;

public class SecondLargest {
    static int print2largest(int arr[], int n) {

        // code here
        int max =0,max2=0;
        for (int i=1 ; i<n ; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        arr[max] = 0;
        for (int i=1 ; i<n ; i++){
            if (arr[max2] < arr[i]){
                max2 = i;
            }
        }
        return arr[max2];
    }
    static int print2largest2(int arr[], int n){
        Arrays.sort(arr);
        for (int i=n-1 ; i>=0 ; i--){
            if (arr[i]>arr[i-1]){
                return arr[i-1];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {12,35,1,10,34,1};
        System.out.println(print2largest2(array,array.length));
    }
}
