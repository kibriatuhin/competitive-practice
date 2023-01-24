package geeksforGeeks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindDupplicate {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0 ;i<n ;i++){
            if(set.contains(arr[i])){
                if(list.contains(arr[i]))
                    continue;
                else
                    list.add(arr[i]);
            }
            set.add(arr[i]);
        }
        if(list.size() == 0){
            list.add(-1);
            return list;
        }

         list.sort((i1, i2)-> i1-i2);
        return  list;
    }
    public static ArrayList<Integer> duplicates2(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] map = new boolean[n];
        for(int i=0 ;i<n ;i++){
            if(map[arr[i]]) {
                if (list.contains(arr[i]))
                    continue;
                else
                    list.add(arr[i]);
            }else {
                map[arr[i]] = true;
            }
        }
        if(list.size() == 0){
            list.add(-1);
            return list;
        }

        list.sort((i1, i2)-> i1-i2);

        return  list;
    }
    public static ArrayList<Integer> duplicates3(int arr[], int n){
        ArrayList<Integer> list = new ArrayList<>();
        int[] count = new int[n];
        for(int i : arr){
            count[i]++;
        }
        for(int i=0 ; i<n ;i++){
            if(count[i]>1){
                list.add(i);
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        return  list;
    }
    public static void main(String[] args) {
        int[] array = {2,3,1,2,3};
        System.out.println(duplicates(array,array.length));
    }
}
