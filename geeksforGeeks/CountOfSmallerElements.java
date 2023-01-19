package geeksforGeeks;

public class CountOfSmallerElements {
    public static long countOfElements(long arr[], long n, long x)
    {
        long count =0;
        for (long i =0 ; i< n ; i++){
            if (arr[(int) i] <= x){
                count++;
               // System.out.println(arr[(int) i]);
            }
        }
        return count;
    }
    public static long countOfElements2(long arr[], long n, long x){
        long st =0 , ed = arr.length-1;
        while (st <= ed){
            long mid = st + (ed-st)/2;
            if (arr[(int) mid] <= x){
                st = mid+1;
            }else {
                ed = mid-1;
            }
        }
        return st;
    }
    static void binarySearch(long arr[] , int x){
        long st =0 , ed = arr.length-1;
        while (st <= ed){
            long mid = st + (ed-st)/2;
             if (arr[(int) mid] <= x){
                st = mid+1;
            }else {
                ed = mid-1;
            }
        }
    }
    public static void main(String[] args) {
        long[] array = {1, 2, 4, 5, 8, 10};
        System.out.println(countOfElements2(array,array.length , 9));
        //binarySearch(array,8);
    }
}
