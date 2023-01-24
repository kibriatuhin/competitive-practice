package geeksforGeeks;

import finalPreparation2.Main;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {
   static int getPairsCount(int[] arr, int n, int k) {
        int count =0;
        for (int i=0 ; i< n ; i++){
            for (int j=i+1 ;j< n ;j++){
                if (k == (arr[i] + arr[j])){
                    count++;
                }
            }
        }
        return count;
    }
    static int getPairsCount1(int[] arr, int n, int k) {
        int count =0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : arr ){
            map.put(num , map.getOrDefault(num,0)+1);
        }
        for (int nums : arr){
            if (map.containsKey(k-nums)){
                count += map.get(k-nums);
            }
            if ((k-nums) == nums)
                count--;
        }
        //System.out.println(count/2);
        return count/2;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1};
        //System.out.println(getPairsCount(array,array.length , 2));
       getPairsCount1(array,array.length,2);
    }
}
