package sorting;

import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int[] array){
        for (int i=1 ;i< array.length ;i++){
            int current = array[i];
            int j = i-1;
            while (j>=0 && array[j] > current){
                array[j+1] = array[j--];
            }
            array[j+1] = current;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] array = {5,2,6,3,1};
        insertionSort(array);
    }
}
