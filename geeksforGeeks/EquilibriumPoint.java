package geeksforGeeks;

public class EquilibriumPoint {
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if(n==0)
            return 0;
        long totalSum = 0,currentSum=0;
        for(int i=0 ; i<n ; i++){
            totalSum += arr[i];
        }
        for(int i=0 ; i<n ; i++){
            long res = totalSum -currentSum -arr[i];
            if(res == currentSum)
                return i+1;
            currentSum +=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
