package geeksforGeeks;

import java.util.Arrays;

public class QuickLeftRotation {
    static void reverse(long[] array , int st , int ed){
        while (st<ed){
            long temp = array[st];
            array[st++] = array[ed];
            array[ed--] = temp;
        }
    }
   static void leftRotate(long arr[], int k,int n)
    {
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        long[] array = {1, 2, 3, 4, 5, 6, 7};
        leftRotate(array,2,array.length);
    }
}
