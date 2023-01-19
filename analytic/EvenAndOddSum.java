package analytic;

import java.util.function.Predicate;

public class EvenAndOddSum {
    static void sum(int[] array){
        int evnSum =0 , oddSum=0;
        Predicate<Integer> p = (i)-> i%2==0;
        for (int n: array){
            if (p.test(n)){
                evnSum +=n;
            }else
                oddSum+=n;
        }
        System.out.println(evnSum + " " + oddSum);
    }
    static void sum2(int[] array){
        int evenSum =0 , odd =0;
        for(int n : array){
            if (n%2==0){
                evenSum +=n;
            }else {
                odd+=n;
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        sum(array);
    }
}
