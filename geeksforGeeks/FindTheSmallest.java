package geeksforGeeks;

import java.util.Arrays;

public class FindTheSmallest {
    public static long[] minAnd2ndMin(long a[], long n)
    {
        long[] newArray = new long[2];
        int small =0 , small1 =0;
        for (int i=1 ;i< n ; i++){
            if (a[small] > a[i]){
                small = i;
            }
        }
        newArray[0] = a[small];
        a[small] = -1;
        for (int i=1 ;i< n ; i++){
            if (newArray[0] != a[i]){


                if (a[small1] == -1){
                        small1 = i;
                }
               else  if (a[i] != -1){
                    if (a[small1] > a[i]){

                        small1 = i;

                    }
                }

            }


        }
        newArray[1] = a[small1];
        System.out.println(Arrays.toString(newArray));
        return newArray;

    }
    public static void main(String[] args) {
        long[] array = {5, 7, 8 ,7 ,5 ,2, 9 ,7, 6, 11, 10, 3, 1};
        minAnd2ndMin(array,array.length);
    }
}
