package analytic;

public class MaximumSubArraySUm {
    static void maximumSub(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i=0 ; i< array.length ; i++){
            int sum = 0;
            for (int j=i ;j< array.length ; j++){
                sum += array[j];
                max = Math.max(sum,max);
            }
        }
        System.out.println(max);
    }
    static void maximumSub2(int[] array){
        int max = Integer.MIN_VALUE,currentSum =0;
        for (int i=0 ; i< array.length ;i++){
            currentSum += array[i];
            if (currentSum > max)
                max = currentSum;
            if (currentSum< 0){
                currentSum =0;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] array  = {-5,4,6,-3,5,-1};
        maximumSub2(array);
        String s = "abc";
        System.out.println(s.contains(Character.toString('c')));
    }
}
