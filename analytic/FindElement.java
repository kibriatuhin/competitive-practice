package analytic;

public class FindElement {
    //linear search
    static void findElement(int[] array,int target){
        for (int i=0 ; i< array.length ; i++){
            if (array[i]==target){
                System.out.println(i);
                break;
            }
        }
    }
    //binary search
    static void findElement2(int[] array , int target){
        int st=0 , ed = array.length-1;
        while (st <= ed){
            int mid = st + (ed-st)/2;
            if (array[mid] == target){
                System.out.println(mid);
                break;
            } else if (array[mid]< target) {
                st= mid +1;
            }else {
                ed = mid-1;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,6,2,9,3};
        findElement2(array,9);
    }
}
