package analytic;

public class SubArray {
    static void printSubArray(int[] array){
        for (int i=0 ; i< array.length ;i++){
            for (int j=i ; j< array.length ; j++){
                for (int k= i ; k<=j ; k++){
                    System.out.print(array[k] + " ");
                }
                System.out.println();
            }
        }
    }
    static void maxSubArraySum(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i=0 ; i< array.length ;i++){
            int sum = 0;
            for (int j=i ;j< array.length ; j++){
                sum += array[j];
                max = Math.max(max,sum);
            }
        }
        System.out.println(max);
    }

    static void subArray(int[] array){
        int count=0;
        for (int i=0 ; i< array.length ; i++){
            for (int j=i ; j< array.length ; j++){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        subArray(array);
    }
}
