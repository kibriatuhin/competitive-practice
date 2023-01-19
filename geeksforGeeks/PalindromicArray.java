package geeksforGeeks;

public class PalindromicArray {
    public static int palinArray(int[] a, int n)
    {
        boolean rslt = true;
        //add code here.
        for (int i=0 ;i<n ; i++){
            int temp =a[i] , sum =0;
            while (temp !=0){
                int rem = temp %10;
                sum = sum * 10 + rem;
                temp /=10;
            }
            if (sum != a[i]){
                rslt = false;
                break;
            }
        }
        if (rslt){
            return 1;
        }else
            return 0;
    }
    public static void main(String[] args) {
        int[] array = {111, 222 ,333 ,444 ,555};
        System.out.println(palinArray(array,array.length));
    }
}
