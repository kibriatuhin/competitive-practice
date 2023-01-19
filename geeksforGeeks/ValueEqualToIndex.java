package geeksforGeeks;

import java.util.ArrayList;
import java.util.Arrays;

public class ValueEqualToIndex {
   static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1 ;i<=n ; i++){
            for (int j=0 ; j<n ; j++){
                if (arr[j] == i){
                    list.add(i);
                    return list;
                }
            }
        }
        list.add(-1);
        return list;
    }
    static ArrayList<Integer> valueEqualToIndex2(int arr[], int n){
        ArrayList<Integer> list = new ArrayList<>();
        int i=1;
        for (int j=0 ; j<n ; j++){
            if (arr[j]== (i++)){
                list.add(i-1);
                return list;
            }
        }
        list.add(-1);
        return list;
    }
    public static void main(String[] args) {
        int[] array = {15,2,45,12,7};
        System.out.println(valueEqualToIndex2(array,array.length));
    }
}
