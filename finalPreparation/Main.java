package finalPreparation;

import java.util.Arrays;

public class Main {
}

class Sorting{
    static void bubbleSort(int[] array){
        for (int i=0 ; i<array.length ; i++){
            for (int j=0 ; j<array.length-1-i;j++){
                if (array[j]> array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    static void selectionSort(int[] array){
        for (int i=0; i< array.length-1 ; i++){
            int smallest = i;
            for (int j=i ; j< array.length ; j++){
                if (array[smallest]> array[j])
                    smallest = j;
            }
            int temp = array[i];
            array[i] =array[smallest];
            array[smallest] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
    static void insertionSort(int[] array){
        for (int i=1 ; i<array.length ; i++){
            int current = array[i];
            int j=i-1;
            while (j>=0 && array[j]> current){
                array[j+1] = array[j--];
            }
            array[j+1] = current;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] array = {5,4,9,1,10,6};
       // bubbleSort(array);
        //selectionSort(array);
        insertionSort(array);
    }
}


class Analytic{
    static void maxMin(int[] array ){
        int min = 0, max =0;
        for (int i=1 ; i<array.length ; i++){
            if (array[min]>array[i])
                min = i;
            if (array[max]<array[i])
                max = i;
        }
        System.out.println(array[min] + " " + array[max]);
        min = min+max;// 5,10 = 15
        max = min-max;//15-10 = 5;
        min = min-max;
        System.out.println(array[min] + " " + array[max]);
    }

    public static void main(String[] args) {
        int[] array = {1,23,0,3,4};
        maxMin(array);
    }
}