package someExtra;

import java.util.Arrays;

public class Sum {
    static int sum(int[] array){
      if (array.length ==0){
          return 0;
      }
      if (array.length==1){
          return array[0];
      }
      return array[array.length-1] + sum(Arrays.copyOf(array,array.length-1));
    }
    static void sum(int[] array,int sum){
        if (array.length ==0){
            System.out.println(sum);
            return ;
        }
        sum +=array[array.length-1];
         sum(Arrays.copyOf(array,array.length-1),sum);
    }
    static void sum(int[] array,int sum,int n){
        if (n ==-1){
            System.out.println(sum);
            return ;
        }
        sum +=array[n];
        sum(array,sum,n-1);
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(sum(array));
    }
}
