package geeksforGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ChocolateDistributionProblem {
    public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
            long min = Integer.MAX_VALUE ;
            for (int i = 0; i < n; i++){
                if ((i+(m-1))<n){
                    min = Math.min(min,(a.get((i+(m-1))) - a.get(i)));
                }
            }

        System.out.println(min);
        return min;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(9);
        list.add(56);
        list.add(7);
        list.add(9);
        list.add(12);
        findMinDiff(list,list.size(),5);
    }
}
