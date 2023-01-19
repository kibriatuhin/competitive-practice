package geeksforGeeks;

public class BalancedArray {
    static long minValueToBalance(long a[] ,int n)
    {
        long mid = n/2,sum1=0,sum2=0;
        for (int i=0 ;i<mid ;i++){
            sum1 = sum1 + a[i];
        }
        for (int i = (int) mid; i< n ; i++){
            sum2 = sum2 + a[i];
        }
        return Math.abs(sum1-sum2);
    }
    public static void main(String[] args) {
        long[] array = {1, 5, 3, 2};
        System.out.println(minValueToBalance(array,array.length));
    }
}
