package geeksforGeeks;

public class ProductOfMaximum {
    public static long find_multiplication (int arr[], int brr[], int n, int m) {
        // Complete the Function
        int max =arr[0],small = brr[0];
        for (int i=1 ;i< n ;i++){
            if (max<arr[i])
                max = arr[i];
        }
        for (int i=1 ;i<m ;i++){
            if (small> brr[i])
                small = brr[i];
        }
        long result = max * small;
        System.out.println(result);
        return result;

    }
    public static void main(String[] args) {
        int[] array1 = {5, 7, 9, 3, 6, 2}, array2 = {1, 2, 6, -1, 0, 9};
        find_multiplication(array1,array2 , array1.length , array2.length);
    }
}
