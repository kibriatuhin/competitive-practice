package finalPreparation4;

import java.util.Arrays;

public class Sorting {
    static void bubbleSort(int[] array){
        for (int i=0 ; i<array.length-1; i++){
            for (int j=0; j< array.length-1-i ; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    static void selectionSort(int[] array){
        for (int i=0 ; i< array.length-1 ; i++){
            int small = i;
            for (int j=i ; j<array.length ; j++){
                if (array[small]> array[j]){
                    small = j;
                }
            }
            int temp = array[i];
            array[i] = array[small];
            array[small] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
    static void insertionSort(int[] array ){
        for (int i=1 ; i<array.length ; i++){
            int current = array[i],j=i-1;
            while (j>=0 && array[j] > current){
                array[j+1] = array[j];
            }
            array[j+1] = current;
        }
        System.out.println(Arrays.toString(array));
    }
    static void divide(int[] array , int st , int ed){
        if (st>=ed){
            return;
        }
        int mid = st+ (ed-st)/2;
        divide(array,st , mid);
        divide(array,mid+1 , ed);
        conquer(array,st,mid,ed);

    }
    static void conquer(int[] array, int st , int mid , int ed){
        int[] merged = new int[ed-st+1];
        int idx1 = st, idx2 = mid+1, m=0 ;
        while (idx1<=mid && idx2<=ed){
            if (array[idx1]< array[idx2])
                merged[m++] = array[idx1++];
            else
                merged[m++] = array[idx2++];
        }
        while (idx1<=mid){
            merged[m++] = array[idx1++];
        }
        while (idx2<=ed){
            merged[m++] = array[idx2++];
        }

        for (int i=0 , j=st ; i<merged.length ; i++,j++){
            array[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {5,1,6,3,2};
      /*  bubbleSort(array);
        selectionSort(array);
        insertionSort(array);*/
        divide(array, 0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
