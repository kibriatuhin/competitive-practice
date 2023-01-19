package analytic;

import java.util.Arrays;

public class InsertElement {
    static void insert(int[] array,int index , int target){
        for (int i= array.length-1 ; i>index ; i--){
            array[i] = array[i-1];
        }
        array[index] = target;
        System.out.println(Arrays.toString(array));
    }
    //sorted array
    static void insert2(int[] array , int key){
        int i;
        for (i = array.length-1 ; (i>=0 && array[i]> key) ; i--){
            array[i] = array[i-1];
        }
        array[i+1] = key;
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] array = {1,2,4,5,6};
        insert2(array,3);
    }
}
