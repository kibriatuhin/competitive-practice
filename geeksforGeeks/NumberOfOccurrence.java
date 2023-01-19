package geeksforGeeks;

public class NumberOfOccurrence {
   static int count(int[] arr, int n, int x) {
        // code here
        int st =0 , ed = n-1,count =0;

        while (st<= ed){
            if (st==ed && arr[st]==x){
                st++;
                ed--;
                count++;
            }else {
                if (arr[st++]== x )
                    count++;
                if (arr[ed--] == x)
                    count++;
            }
        }
       System.out.println(count);
        return count;
    }
    public static void main(String[] args) {
       int[] array = {1, 1, 2, 2, 2, 2, 3};
       count(array,array.length , 2);
    }
}
