package geeksforGeeks;

public class FindTransitionPoint {
   static int transitionPoint(int arr[], int n) {
        for (int i=0 ;i< n ; i++){
            if(arr[i] == 1)
                return i;
        }
        return -1;
    }
    int transitionPoint2(int arr[], int n) {
        int st = 0 ,ed = n-1;
        while(st<= ed){
            int mid = st + (ed-st)/2;
            if(arr[mid] == 0){
                st = mid+1;
            }else if(arr[mid] == 1){
                if(mid ==0 || (mid>0 && arr[mid-1] == 0)){
                    return mid;
                }
                ed = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {0,0,0};
        System.out.println(transitionPoint(array,array.length));
    }
}
