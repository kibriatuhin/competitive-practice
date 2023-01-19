package geeksforGeeks;

public class IndexOfFirst1InASortedArray {
    public static long firstIndex(long arr[], long n)
    {
        int ans=-1 , low=0, high = (int) (n-1);
        while (low <=high){
            int mid = low + (high-low)/2;
            if (arr[mid] == 1){
                ans = mid;
                high = mid-1;
            }
            if (arr[mid] == 0){
                low = mid+1;
            }
        }
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        long[] array = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
        firstIndex(array,array.length);
    }
}
