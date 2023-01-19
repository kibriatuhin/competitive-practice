package geeksforGeeks;

import java.util.Arrays;

public class RotateArray {
    static void reverse(int[] array , int st , int lst){
        while (st<lst){
            int temp = array[st];
            array[st++] = array[lst];
            array[lst--] = temp;
        }
    }
    static void leftRotate(int[] arr, int n, int d) {
        reverse(arr,0,d-1);

        reverse(arr,d,n-1);

        reverse(arr,0,n-1);

    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        leftRotate(array,array.length,2);
    }
}
