package analytic;

public class MissingValue {
    static void missingElement(int[] array){
        int totalSum =0 , arraySum = 0;
        for (int i=array[0] ; i<= array[array.length-1] ; i++){
            totalSum += i;
        }
        for (int i=0 ;  i< array.length  ; i++){
            arraySum +=array[i];
        }
        System.out.println(totalSum-arraySum);
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,5,6};
        missingElement(array);
    }
}
