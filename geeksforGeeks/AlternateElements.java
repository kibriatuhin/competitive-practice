package geeksforGeeks;

public class AlternateElements {
    public static void print(int arr[], int n)
    {
        // your code here
        for (int i=0 ; i<n ; i++){
            if (i%2==0){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {

    }
}
