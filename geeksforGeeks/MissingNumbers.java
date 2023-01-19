package geeksforGeeks;

public class MissingNumbers {
    public static int missingNumber(int A[], int N)
    {
        int max = A[0],min = A[0],totalSum=0 , givenSum=0;
        for (int i=0 ;i<N ;i++){
            givenSum+=A[i];
            if (max<A[i])
                max = A[i];
            if (min> A[i])
                min = A[i];
        }
        for (int i=min ;i<=max ;i++){
            totalSum+=i;
        }
        int result = totalSum-givenSum;
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        int[] array =  {2, 5, 3, 1};
        missingNumber(array,array.length);
    }
}
