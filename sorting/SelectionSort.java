package sorting;

import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int[] array){
        for (int i=0 ;i< array.length-1 ; i++){
            int smallest = i;
            for (int j= i+1 ; j<array.length ; j++){
                if (array[smallest]> array[j]){
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] array = {5,2,6,3,1};
        selectionSort(array);
    }
}
