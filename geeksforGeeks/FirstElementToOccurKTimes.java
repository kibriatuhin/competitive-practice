package geeksforGeeks;

import java.util.HashMap;
import java.util.Map;

public class FirstElementToOccurKTimes {
    public static int firstElementKTime(int[] a, int n, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0 ;i<n ; i++){
            map.put(a[i] , map.getOrDefault(a[i],0)+1);
            if (map.get(a[i]) == k){
                return a[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1, 7, 4, 3, 4, 8, 7};
        System.out.println(firstElementKTime(array,array.length , 2));
    }
}
