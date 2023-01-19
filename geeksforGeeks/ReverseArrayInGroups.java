package geeksforGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayInGroups {
   static void reverseArray(Object[] array ,int st, int ed){
        while (st<ed){
            int temp = (int) array[st];
            array[st++] = array[ed];
            array[ed--] = temp;
        }
        //System.out.println(Arrays.toString(array));
    }
   static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        Object[] array = arr.toArray();
        //System.out.println(Arrays.toString(array));
        reverseArray(array,0,k-1);
        reverseArray(array,k,n-1);
        for (Object s : array){
            System.out.print(s+ " ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        reverseInGroups(list,list.size(),3);
    }
}
