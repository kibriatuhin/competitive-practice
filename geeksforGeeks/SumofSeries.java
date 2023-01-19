package geeksforGeeks;

public class SumofSeries {
   static long seriesSum(int n) {
        // code here
        long sum =0;
        for (int i=1 ; i<=n ; i++){
            sum +=i;
        }
        return sum;
    }
    static long seriesSum2(int n){
       long sum = (n*(n-1))/2;
       return sum;
    }
    public static void main(String[] args) {
        System.out.println(seriesSum2(5));
    }
}
