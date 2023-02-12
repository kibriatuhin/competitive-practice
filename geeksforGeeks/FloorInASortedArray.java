package geeksforGeeks;

public class FloorInASortedArray {
    static int findFloor(long arr[], int n, long x)
    {
        int l = 0 , r = n-1;
        while (l<=r){
            int mid = l + (r-l)/2;
            if (arr[mid] == x){
                return mid;
            }
            if(arr[mid] > x){
                r = mid-1;
            }else {
                l = mid+1;
            }
        }
        //System.out.println(arr[r]);
        if (r>=0 && arr[r]<x){
            return l-1;
        }
        return  -1;
    }
    public static void main(String[] args) {
        long[] array = {1,2,8,10,11,12,19};
        System.out.println(findFloor(array,array.length ,17));
    }
}
