package analytic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Frequency {
    //map
    static void findFrequency(int[] array){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0 ; i< array.length ;i++){
            map.put(array[i], map.getOrDefault(array[i],0)+1 );
        }
        System.out.println(map);
    }

    //brute force
    static void findFrequency2(int[] array){
        boolean[] bol = new boolean[array.length];
        for (int i=0 ; i< array.length ;i++){
            if (bol[i]==true)
                continue;
            int count =1;
            for (int j=i+1 ; j< array.length ; j++){
                if (array[i]==array[j]){
                    bol[j]=true;
                    count++;
                }
            }
            System.out.println(array[i] + " " + count);
        }
    }

    public static void main(String[] args) {
        int[] array = {5,6,2,1,9,2,6,5};
        findFrequency2(array);
    }
}
