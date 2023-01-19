package analytic;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //brute force
    static void  findTwoSum(int[]  array, int target){
        for (int i=0 ; i< array.length ; i++){
            for (int j=i+1 ; j< array.length ;j++){
                if ((array[i]+array[j])== target){
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
    }

    //map
    static void  findTwoSum2(int[]  array, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0 ; i< array.length ; i++){
            int rem = Math.abs(target-array[i]);
            if (map.containsKey(rem)){
                System.out.println(map.get(rem) + " " + i);
                break;
            }
            map.put(array[i] , map.getOrDefault(array[i],-1)+1);
        }
    }
    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        findTwoSum2(array,13);
    }
}
