package analytic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondMaxMin {
    static void secondMax(int[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(array[1] + " " + array[array.length-2]);
    }
    public static void main(String[] args) {
        int[] array = {5,2,1,8,10,7};
        secondMax(array);
    }
}
