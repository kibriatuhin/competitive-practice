package analytic;

import java.util.*;

public class DupplicateValueRemove {
    //brute force
    static void dupplicateValueRemove(int[] array){
        int dupplicateIndex=-1 ;
        for (int i=0 ; i< array.length ; i++){
            for (int j=i+1 ; j<array.length ;j++){
                if (array[i]== array[j]){
                    dupplicateIndex = j;
                }
            }
        }
        for (int i=dupplicateIndex ; i< array.length-1 ; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = -1;
        System.out.println(Arrays.toString(array));
    }

    //set
    static void dupplicateValueRemove2(int[] array){
        Set<Integer> set = new HashSet<>();
        int dupplicateIndex =-1;
        for (int i=0 ; i< array.length ; i++){
            if (set.contains(array[i])){
                dupplicateIndex = i;
            }
            set.add(array[i]);
        }
        for (int i=dupplicateIndex ; i< array.length-1 ; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = -1;
        System.out.println(Arrays.toString(array));
    }

    //map
    static void dupplicateValueRemove3(int[] array){
        Map<Integer, Integer> map = new HashMap<>();
        int dupplicateIndex =-1;
        for (int i=0 ;i< array.length ; i++){
            if (map.containsKey(array[i])){
                dupplicateIndex = i;
                break;
            }
            map.put(array[i], map.getOrDefault(array[i],0)+1);
        }
        for (int i=dupplicateIndex ; i< array.length-1 ; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = -1;
        System.out.println(Arrays.toString(array));
    }



    public static void main(String[] args) {
        int[] array = {1,2,5,2,3,10};
        dupplicateValueRemove3(array);
    }
}
