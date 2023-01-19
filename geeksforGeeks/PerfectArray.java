package geeksforGeeks;

public class PerfectArray {
    public static boolean IsPerfect(int a[], int n)
    {
        // Complete the function
        int st=0 , ed = a.length-1;
        while (st<ed){
            if (a[st++] != a[ed--]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,1,1};
        System.out.println(IsPerfect(array,array.length));
    }
}
