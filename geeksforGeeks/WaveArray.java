package geeksforGeeks;

import java.util.Arrays;

public class WaveArray {
    public static void convertToWave(int n, int[] a) {
        int temp =0;
        for (int i=0 ; i< n-1 ; i+=2){
            if (a[i]<a[i+1]){
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int[] array = {2,4,7,8,9,10};
        convertToWave(array.length,array);
    }
}
