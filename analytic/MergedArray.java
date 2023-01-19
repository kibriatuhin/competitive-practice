package analytic;

import java.util.Arrays;

public class MergedArray {
    //unsorted
    static void merged(int[] array1 , int[] array2){
        int[] merged = new int[array1.length + array2.length];
        int arr1=0, arr2=0 , m=0;
        while (arr1 < array1.length){
            merged[m++]= array1[arr1++];
        }
        while (arr2 < array2.length){
            merged[m++]= array2[arr2++];
        }
        System.out.println(m);
        System.out.println(Arrays.toString(merged));
    }

    //sorted array create

    static void merged2(int[] array1 , int[] array2){
        int[] merged = new int[array1.length + array2.length];
        int arr1=0, arr2=0,m=0;
        while (arr1< array1.length && arr2<array2.length){
            if (array1[arr1]< array2[arr2])
                merged[m++] = array1[arr1++];
            else
                merged[m++] = array2[arr2++];
        }
        while (arr1< array1.length){
            merged[m++] = array1[arr1++];
        }
        while (arr2< array2.length){
            merged[m++] = array2[arr2++];
        }
        System.out.println(Arrays.toString(merged));
    }

    public static void main(String[] args) {
        int[] array1 = {3,4,9};
        int[] array2 = {1,2,5};
        merged2(array1, array2);
    }
}
