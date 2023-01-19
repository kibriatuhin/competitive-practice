package searching;

public class LinearSearch {
    static void linearSearch(int[] array, int target){
        for (int i=0 ; i< array.length ; i++){
            if (array[i] == target){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,3,9,4,5};
        int target=5;
        linearSearch(array, target);
    }
}
