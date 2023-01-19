package geeksforGeeks;

public class MinimumDistance {
    static int minDist(int a[], int n, int x, int y) {
        // code here
        int count1 = 0 , count=0;
        for (int  i=0 ;i< n ; i++){
            if (a[i] == x){
                count1++;
            }if (a[i] == y){
                count++;
            }
        }
        if (count>0 && count1>0){
            for (int i = 0 ; i< n ; i++){
                if (a[i] == x){
                    return x;
                }if (a[i] == y){
                    return y;
                }

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,2};
        System.out.println(minDist(array,array.length , 1,2));
    }
}
