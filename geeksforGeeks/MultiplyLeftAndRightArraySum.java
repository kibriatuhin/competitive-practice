package geeksforGeeks;

public class MultiplyLeftAndRightArraySum {
    public static int multiply (int arr[], int n) {
        //Complete the function
        int mid = n/2,sum1=0,sum2=0;
        for (int i=0 ;i<mid ;i++){
            sum1 = sum1 + arr[i];
        }
        for (int i=mid ; i< n ;i++){
            sum2 = sum2 + arr[i];
        }
        System.out.println(sum1*sum2);
        return sum1*sum2;

    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        multiply(array,array.length);
    }
}
