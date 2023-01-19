package analytic;

public class ThreeSum {
    static void sum(int[] array , int target){
        int count =0;
        for (int i=0 ; i< array.length-2 ; i++){
            for (int j=i+1; j< array.length-1 ; j++){
                for (int k=j+1 ; k< array.length ;k++){
                    if ((array[i]+array[j]+array[k])==target)
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                }
            }
        }
        System.out.println(count);
    }
    
    public static void main(String[] args) {
        int[] array = {1, 4, 45, 6, 10, 8};
        sum(array,24);
    }
}
