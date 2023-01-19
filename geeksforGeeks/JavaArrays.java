package geeksforGeeks;

public class JavaArrays {
    String average(int A[], int N)
    {
        int sum = 0;
        for (int i=0 ;i<N ; i++){
            sum+=A[i];
        }
        //System.out.printf(sum +" ");
        String result = String.format("%.2f",sum/N);

        return result;
    }
    public static void main(String[] args) {

    }
}
