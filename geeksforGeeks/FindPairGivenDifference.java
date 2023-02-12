package geeksforGeeks;

import java.util.Arrays;

public class FindPairGivenDifference {
    public static boolean findPair(int arr[], int size, int n)
    {
        Arrays.sort(arr);
        int l =0,r = size-1;
        while (l<r){
            int sub = arr[r]- arr[l];
            if (sub == n){
                return true;
            }
            if (sub>n){
                r--;
            }
            if (sub<n){
                l++;
            }
        }
        return false;
    }
    public static boolean findPair1(int arr[], int size, int n){
        Arrays.sort(arr);
        int l=0 , r =1;
        while (l<size && r<size){
            if ((arr[r]- arr[l]) == n)
                return true;
            else if ((arr[r]- arr[l]) < n){
                r++;
            }else if ((arr[r]- arr[l])>n){
                l++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {90, 70, 20, 80, 50};
        System.out.println(findPair1(array,array.length ,30));

    }
}
