package searching;

public class BinarySearch {
    static void binarySearch(int[] array, int target){
        int st =0 ;
        int ed = array.length-1;
        while (st<=ed){
            int mid = st + (ed - st)/2;
            if (array[mid] == target){
                System.out.println(mid);
                break;
            } else if (array[mid]< target) {
                st = mid +1;
            }else
                ed = mid-1;
        }
    }
    public static void main(String[] args) {
        int[] array = {6,7,9,10,12};
        binarySearch(array, 10);
    }
}
