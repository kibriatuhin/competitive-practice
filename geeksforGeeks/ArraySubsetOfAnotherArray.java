package geeksforGeeks;

import java.util.ArrayList;

public class ArraySubsetOfAnotherArray {
    public static String isSubset( long a1[], long a2[], long n, long m) {
        ArrayList<Long> list = new ArrayList<>();
        for (int i=0 ;i< n ; i++){
            list.add(a1[i]);
        }

        for (int i=0 ;i<m ; i++){
            if (list.contains(a2[i])){
                list.remove(a2[i]);
            }else {
                return "No";
            }
        }

        return "Yes";
    }
    public static void main(String[] args) {
        long[] array = {10, 5, 2, 23, 19};
        long[] array1 = {19, 5, 3};
        System.out.println(isSubset(array,array1,array.length,array1.length));
    }
}
