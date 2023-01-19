package analytic;

import java.util.Arrays;

public class Reverse {
    static void reverseArray(int[] array){
        int st =0 , ed = array.length-1;
        while (st<=ed){
            int temp = array[st];
            array[st++] = array[ed];
            array[ed--] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
    static void reverseString(String s){
        char[] array = s.toCharArray();
        int st =0 , ed = array.length-1;
        while (st<=ed){
            char temp = array[st];
            array[st++] = array[ed];
            array[ed--] = temp;
        }
        s = String.valueOf(array);
        System.out.println(s);
    }
    public static void main(String[] args) {
        int[] array = {5,3,1,10,12};
        reverseString("tuhin");
    }
}
