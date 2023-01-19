package geeksforGeeks;

public class SumOfArray {
    public static long getSum(long a[], long n)
    {
        long sum = 0;
        for (long i = 0 ; i<n ; i++){
            sum += a[(int) i];
        }
        return sum;
    }
    public static void main(String[] args) {
        long[] array = {1,2,3,4,5};
        System.out.println(getSum(array,array.length));
    }

}
