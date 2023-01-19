package geeksforGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortInSpecificOrder {
    public static void sortIt(long arr[], long n)
    {
        Long[] array = new Long[(int) n];
        int odd = 0;
        for (int i=0 ; i< n ; i++){
            if (arr[i]%2!=0){
                array[odd++] = arr[i];
            }

        }
        Arrays.sort(array,0,odd, Collections.reverseOrder());
        //System.out.println(Arrays.toString(array));
        int even = odd;
        for (int i=0 ; i< n ; i++){
            if (arr[i]%2==0)
                array[even++] = arr[i];
        }
        Arrays.sort(array,odd,even);
        //System.out.println(Arrays.toString(array));
        for (int i=0 ; i< n ; i++){
            arr[i] = array[i];
        }
       // System.out.println(Arrays.toString(arr));



    }
    public static void main(String[] args) {
        long[] array = {1, 2, 3, 5, 4, 7, 10};
        sortIt(array,array.length);
    }
}
