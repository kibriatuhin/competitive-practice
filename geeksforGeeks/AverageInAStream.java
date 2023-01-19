package geeksforGeeks;

import java.util.Arrays;

public class AverageInAStream {
    static float[] streamAvg(int[] arr, int n) {
        float[] result = new float[arr.length];
        result[0] = arr[0];
        for (int i=1 ; i<arr.length ; i++){
            result[i] = (arr[i]+result[i-1]);
        }
        for (int i=0 ; i<arr.length ; i++){
            result[i] = result[i]/(i+1);
        }
        //System.out.println(Arrays.toString(result));
        return result;
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        streamAvg(array,array.length);

    }
}
