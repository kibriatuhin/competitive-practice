package analytic;

public class MaxMinValue {
    static void maxMin(int[] array){
        int max = array[0],min = array[0];
        for (int i=0 ; i< array.length ;i++){
            if (array[i] > max)
                max = array[i];
            if (array[i]<min)
                min = array[i];
        }
        System.out.println(min + " " + max);
    }
    public static void main(String[] args) {
        int[] array = {5,2,1,8,10,7};
        maxMin(array);
    }
}
