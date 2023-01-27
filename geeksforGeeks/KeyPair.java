package geeksforGeeks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class KeyPair {
    static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0 ;i<n ; i++){
            int rem = x-arr[i];
            if (set.contains(rem)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
    static boolean hasArrayTwoCandidates2(int arr[], int n, int x){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0 ;i < n  ; i++){
            int rem = x-arr[i];
            if (map.containsKey(rem)){
                return true;
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1 );
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 3, 6};
        System.out.println(hasArrayTwoCandidates2(array,array.length,10));
    }
}
