package geeksforGeeks;

import java.util.Arrays;

public class BinaryArraySorting {
    static void binSort(int A[], int N)
    {
        int count =-1 ;
        for (int i=0 ;i<N ; i++){
            if (A[i] == 0)
                count++;
        }
        for (int i=0 ;i<N  ; i++){
           if (i<=count){
               A[i] = 0;
           }else {
               A[i] = 1;
           }
        }
        System.out.println(Arrays.toString(A));

    }
    public static void main(String[] args) {
        int[] array = {1,0,1,1,0};
        binSort(array,array.length);
    }
}
