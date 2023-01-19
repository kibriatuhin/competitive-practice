package analytic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DupplicateFInd {
    //brute force
    static void findDupplicate(int[] array){
        for (int i=0 ; i< array.length ; i++){
            for (int j=i+1 ; j< array.length ; j++){
                if (array[i] == array[j]){
                    System.out.println(array[j]);
                    break;
                }
            }
        }
    }

    //using set
    static void findDupplicate2(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int i=0 ; i< array.length ; i++){
            if (set.contains(array[i])){
                System.out.println(array[i]);
                break;
            }
            set.add(array[i]);
        }
    }
    //map
    static void findDupplicate3(int[] array){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0 ; i< array.length ; i++){
            if (map.containsKey(array[i])){
                System.out.println(array[i]);
                break;
            }
            map.put(array[i], map.getOrDefault(array[i],0)+1);
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        int[] array = {1,2,5,2,3,10};
        findDupplicate3(array);
    }
}
