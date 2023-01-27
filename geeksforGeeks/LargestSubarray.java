package geeksforGeeks;

import java.io.IOException;
import java.util.*;

public class LargestSubarray {
   static int maxLen(int arr[], int n)
    {
        int max = Integer.MIN_VALUE;
        for (int i=0 ; i< n ;i++){
            int sum =0;
            for (int j=i ; j< n ; j++){
                sum +=arr[j];
                if (sum == 0){
                    max = Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
    static int maxLen2(int arr[], int n){
        int pre[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            pre[i] = pre[i - 1] + arr[i - 1];
        }
        Map<Integer, LinkedList<Integer>> map = new HashMap<>();
        map.put(0, new LinkedList<>());
        for (int i = 1; i <= n; i++) {
            map.put(pre[i], new LinkedList<>());
        }
        map.get(0).add(0);
        for (int i = 1; i <= n; i++) {
            map.get(pre[i]).add(i);
        }
        int mx = 0;
        for (int i = 1; i <= n; i++) {
            if (map.getOrDefault(pre[i], new LinkedList<>()).size() > 1) {
                mx = Math.max(mx, map.get(pre[i]).getLast() - map.get(pre[i]).getFirst());
                map.remove(pre[i]);
            }
        }
        System.out.println(mx);
       return mx;
    }
    public static void main(String[] args) {
        int[] array = {15, -2, 2, -8, 1, 7, 10, 23};
        maxLen2(array, array.length);
    }
}
class Program {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int pre[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            pre[i] = pre[i - 1] + arr[i - 1];
        }
        Map<Integer, LinkedList<Integer>> map = new HashMap<>();
        map.put(0, new LinkedList<>());
        for (int i = 1; i <= n; i++) {
            map.put(pre[i], new LinkedList<>());
        }
        map.get(0).add(0);
        for (int i = 1; i <= n; i++) {
            map.get(pre[i]).add(i);
        }
        int mx = 0;
        for (int i = 1; i <= n; i++) {
            if (map.getOrDefault(pre[i], new LinkedList<>()).size() > 1) {
                mx = Math.max(mx, map.get(pre[i]).getLast() - map.get(pre[i]).getFirst());
                map.remove(pre[i]);
            }
        }
        System.out.println(mx);
    }
}