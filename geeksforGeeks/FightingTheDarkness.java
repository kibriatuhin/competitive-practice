package geeksforGeeks;

public class FightingTheDarkness {
    static long maxDays(long arr[], int n){
        // code here
        long max = arr[0];
        for (int i=0 ;i< n ;i++){
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        long[] array = {1,1,2};
        System.out.println(maxDays(array,array.length));
    }
}
