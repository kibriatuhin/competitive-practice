package geeksforGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0 ; i<n ; i++){
            int current = arr[i];
            if (current == s){
                list.add(i+1);
                return  list;
            }else {
                for (int j=i+1 ; j< n ; j++){
                    current += arr[j];
                    if (current == s){
                        list.add(i+1);
                        list.add(j+1);
                        return list;
                    }
                }
            }
        }
        return list;
    }
    static ArrayList<Integer> subarraySum2(int[] arr, int n, int s){
        int start =0 , sum =0 ;
        ArrayList<Integer> list = new ArrayList<>();
        for (int end =0 ; end<n ; end++){
            sum +=arr[end];
            while (sum>s){
                sum -= arr[start];
                start++;
            }
            if (sum == s){
                if (start<=end){
                    list.add(start+1);
                    list.add(end+1);
                    return list;
                }
            }
        }
        list.add(-1);
        return list;
    }
    public static void main(String[] args) {
        int[] array = {1 ,2 ,3 ,7 ,5};
        System.out.println( subarraySum2(array,5,12));

    }
}
