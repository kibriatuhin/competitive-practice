package geeksforGeeks;

public class BinarySearch {
   static int binarysearch(int arr[], int n, int k) {
        // code here
        int st =0 , ed = n-1;
        while (st<=ed){
            int mid = st + (ed-st)/2;
            if (arr[mid] == k)
                return mid+1;
            else if (arr[mid]<k) {
                st = mid+1;
            }else
                ed = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array  = {1 ,2 ,3 ,4 ,5};
        System.out.println(binarysearch(array,array.length , 4));
    }
}
