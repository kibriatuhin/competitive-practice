package geeksforGeeks;

public class ThirdLargestElement {
   static int thirdLargest(int a[], int n)
    {
        if (n<3){
            return -1;
        }
        int max1 = 0,max2=0 , max =0;
        for (int i=1 ;i<n ; i++){
            if (a[max1] < a[i] ){
                max1 = i;
            }
        }
        a[max1] = -1;
        for (int i=1 ;i<n ; i++){
            if (a[max2] < a[i] ){
                max2 = i;
            }
        }
        a[max2] = -1;
        for (int i=1 ;i<n ; i++){
            if (a[max] < a[i] ){
                max = i;
            }
        }
       // System.out.println(max);
        return max;

    }
    public static void main(String[] args) {
       int[] array = {2,4,1,3,5};
       thirdLargest(array,array.length);
    }
}
