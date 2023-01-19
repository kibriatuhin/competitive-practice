package geeksforGeeks;

import java.util.Arrays;

public class SmallerAndLarger {
   static int[] getMoreAndLess(int[] arr, int n, int x) {
        int[] array = new int[2];
        int small =0,large=0;
        for (int i=0 ; i<n ;i++){
            if (arr[i]<x)
                small++;
            if (arr[i]>x)
                large++;
        }
        array[0]=small;
        array[1] = large;
        return array;
    }
    static int[] getMoreAndLess1(int[] arr, int n, int x){
        int[] array = new int[2];
        int small =0,large=n-1;
        while (small<large){
            int mid = small + (large-small)/2;
            if (arr[mid] < x){
                small = mid+1;
            }else if (arr[mid]> x){
                large = mid-1;
            }
        }

        array[0] = small;
        array[1] = n-large;
        System.out.println(Arrays.toString(array));
        return array;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 8, 10, 11, 12, 19};
        getMoreAndLess1(array,array.length , 0);
    }
}
