package geeksforGeeks;

import java.util.HashSet;
import java.util.Set;

public class ElementsInTheRange {
   static boolean check_elements(int arr[], int n, int A, int B)
    {
        Set<Integer> set = new HashSet<>();
        int count =0;
        for (int i=0 ; i<n;i++){
            if (arr[i] >= A && arr[i]<=B){
                set.add(arr[i]);
            }
        }
        int find = B-(A-1);
        return set.size()==find;
       // return b;
    }
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 2, 7, 8, 3};
        System.out.println(check_elements(array,array.length,2,5));
    }
}
