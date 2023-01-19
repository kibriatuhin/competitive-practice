package milonPractice;

public class FindElement {
    static void findElement(int[] array, int target){
        for (int i=0 ;i< array.length ; i++){
            if (array[i] == target){
                System.out.println(i);
                break;
            }
        }
    }
    static void findElement2(int[] array, int target){
        int st=0 , ed = array.length-1;
        while (st<=ed){
            int mid = st+(ed-st)/2;
            if (array[mid] == target){
                System.out.println(mid);
                break;
            } else if (array[mid] > target) {
                ed = mid-1;
            }else {
                st = mid+1;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        findElement2(array,7);
    }
}
