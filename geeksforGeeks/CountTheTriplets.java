package geeksforGeeks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountTheTriplets {
  static   int countTriplet(int arr[], int n) {
        Arrays.sort(arr);
        int count =0;
      Set<Integer> set = new HashSet<>();
      for (int i : arr){
          set.add(i);
      }
      for (int i=0 ; i< n-1 ; i++){
          for (int j=i+1 ; j<n ; j++){
              if (set.contains((arr[i] + arr[j]))){
                  count++;
              }
          }
      }
     // System.out.println(count);
        return count;
    }
    static   int countTriplet1(int arr[], int n){
      int count =0;
      Arrays.sort(arr);
      for (int i=n-1 ; i>=2 ; i--){
          int l=0,r = i-1;
          while (l<r){
              int sum = (arr[l]+arr[r]);
              if ( sum == arr[i]){
                  count++;l++;r--;
              }
              if (sum < arr[i]){
                  l++;
              }
              if (sum>arr[i]){
                  r--;
              }
          }
      }
        System.out.println(count);
      return count;
    }
    public static void main(String[] args) {
        int[] array = {12 ,8, 2, 11, 5, 14, 10};
        countTriplet1(array,array.length);
    }
}
