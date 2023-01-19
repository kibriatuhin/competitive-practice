package analytic;

import java.util.Arrays;

public class PrefixSum {
    static void prefixSum(int[] array , int st,int ed){
        int[] pre = new int[array.length];
        pre[0] = array[0];
        for (int i=1 ; i< array.length ; i++){
            pre[i] = pre[i-1] + array[i];
        }

        System.out.println(pre[ed] - pre[st-1]);
        System.out.println(Arrays.toString(pre));
    }
    public static void main(String[] args) {
        int[] array = {5,6,7,8};
        prefixSum(array,2,3);
    }
}
