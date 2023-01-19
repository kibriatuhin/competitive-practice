package geeksforGeeks;

public class MaximumProductOfTwoNumbers {
    static int maxProduct(int arr[], int n) {
        int result = 0;
        for (int i=0 ; i<n-1 ;i++){
            result = Math.max(result,(arr[i]*arr[i+1]));
        }
        return  result;
    }
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 7, 0};
        System.out.println(maxProduct(array,array.length));
    }
}
