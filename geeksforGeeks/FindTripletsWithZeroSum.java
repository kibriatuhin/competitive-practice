package geeksforGeeks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FindTripletsWithZeroSum {
    public static boolean findTriplets(int arr[] , int n)
    {
        for (int i=0 ;i<n-2 ; i++){
            for (int j= i+1 ; j<n-1 ; j++){
                for (int k=j+1 ; k<n  ; k++){
                    if ((arr[i]+arr[j]+arr[k]) == 0){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean findTriplets2(int arr[] , int n){
        for (int i=0 ; i<n-2 ;i++){
            List<Integer> list = new ArrayList<>();
            int current = 0-arr[i];
            for (int j=i+1 ;j<n ; j++){
                if (list.contains((current-arr[j]))){
                    return true;
                }
                list.add(arr[j]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {0, -1, 2, -3, 1};
        System.out.println(findTriplets(array,array.length));
    }
}
