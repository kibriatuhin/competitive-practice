package milonPractice;

import java.util.*;

public class Dupplicate {
    static void  dupplicateValue(int[] array){

        for (int i=0 ; i< array.length ; i++){
            for (int j= i+1 ; j < array.length ; j++){
                if (array[i] == array[j]){
                    System.out.println(array[j]);
                    break;
                }
            }
        }
    }
    static void  dupplicateValue1(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int i=0 ; i< array.length ; i++){
            if (set.contains(array[i])){
                System.out.println(array[i]);
                break;
            }
            set.add(array[i]);
        }
    }

    static void dupplicateValue2(int[] array){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0 ; i< array.length ; i++){
            if (map.containsKey(array[i])) {
                System.out.println(array[i]);
                return;
            }
            map.put(array[i], map.getOrDefault(array[i],1) );
        }
    }

    static void dupplicateValueRemove(int[] array){
        Set<Integer> set = new HashSet<>();
        int sIn = -1;
        for (int i=0 ; i< array.length ;i++){
            if (set.contains(array[i])){
                sIn = i;
                break;
            }
            set.add(array[i]);
        }
        for (int i = sIn ; i< array.length-1; i++){
            array[i] = array[i+1];

        }
        array[array.length-1] = -1;
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array  = {1,2,4,2,3,20};
        dupplicateValueRemove(array);
    }
}
