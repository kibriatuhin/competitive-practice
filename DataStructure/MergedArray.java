package DataStructure;

import java.util.Arrays;

public class MergedArray {
    static void conquer(int[] array , int st , int mid , int ed){
        int[] merged  = new int[ed - st+1];
        int idx1 = st , idx2 = mid+1 , m = 0;
        while (idx1 <= mid && idx2 <= ed){
            if (array[idx1] <= array[idx2]){
                merged[m++] = array[idx1++];
            }else
                merged[m++] = array[idx2++];

        }
        while (idx1 <= mid){
            merged[m++] = array[idx1++];
        }
        while (idx2 <=ed){
            merged[m++] = array[idx2++];
        }

        for (int i=0 , j= st ; i < merged.length ; i++,j++){
            array[j] = merged[i];
        }

    }
    static void divide(int[] array , int st , int ed){
        if (st>=ed)
            return;
        int mid = st + (ed - st)/2;
        divide(array, st , mid);
        divide(array,mid+1 , ed);
        conquer(array, st , mid , ed);
    }
    public static void main(String[] args) {
        int[] array = {5,2,1,8,3};
        int st = 0;
        int ed = array.length-1 ;
        divide(array,st,ed);
        System.out.println(Arrays.toString(array));
    }
}
