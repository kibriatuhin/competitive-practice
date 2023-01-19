package geeksforGeeks;

import java.util.HashSet;
import java.util.Set;

public class CheckIfTwoArraysAreEqual {
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        if (A.length != B.length){
            return false;
        }
        int count =0;
        Set<Long> set = new HashSet<>();
        for (int i=0 ; i<N ; i++){
            set.add(A[i]);
        }
        Set<Long> set1 = new HashSet<>();
        for (int i=0 ; i<N ; i++){
            set.add(B[i]);
        }
        if (set.size() !=set1.size()){
            return false;
        }
        for (Long s : B){
            if (set.contains(s)){
                count++;
            }
        }
        if (count==N){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        long[] array1 = {20 ,6, 17, 15, 19};
        long[] array2 = {6, 17 ,20 ,19, 19};
        System.out.println( check(array1,array2,array1.length));
    }
}
