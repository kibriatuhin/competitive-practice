package geeksforGeeks;

public class ExceptionallyOdd {
   static int getOddOccurrence(int[] arr, int n) {
        int result = 0;
        for (int i=0 ; i<arr.length ; i++){
            result = result^arr[i];
        }
        //System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 3, 1, 3};
        getOddOccurrence(array,array.length);
    }
}
