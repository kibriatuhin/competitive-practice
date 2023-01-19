package geeksforGeeks;

public class SearchingANumber {
    public int search(int arr[], int n, int k) {
        // code here
        for (int i=0 ; i<n ; i++){
            if (arr[i] == k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
