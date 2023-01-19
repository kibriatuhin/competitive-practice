package geeksforGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintTheLeftElement {
     void divide(long[] array , int st , int ed){
        if (st>=ed){
            return;
        }
        int mid = st +(ed-st)/2;
        divide(array,st,mid);
        divide(array,mid+1 , ed);
        conquer(array,st,mid,ed);
    }
     void conquer(long[] array , int st , int mid , int ed){
        long[] merged = new long[ed-st+1];
        int idx1=st,idx2=mid+1,m=0;
        while (idx1<=mid && idx2<=ed){
            if (array[idx1]<=array[idx2]){
                merged[m++] = array[idx1++];
            }else {
                merged[m++] = array[idx2++];
            }
        }
        while (idx1<=mid){
            merged[m++] = array[idx1++];
        }
        while (idx2<=ed){
            merged[m++] = array[idx2++];
        }
        for (int i=0,j=st ; i<merged.length ; i++,j++){
            array[j] = merged[i];
        }

    }

    public  long leftElement2(long arr[], long n){
        divide(arr,0, (int) (n-1));
        /*List<Long> list = new ArrayList<>();
        for (long s : arr){
            list.add(s);
        }
        while (list.size()!=1){
            list.remove( new Long(list.get(list.size()-1)));
            if (list.size()!=1){
                list.remove(new Long(list.get(0)));
            }
        }

        System.out.println(list.get(0));*/


        return arr[(int) (n/2)] ;
    }

    public static long leftElement(long arr[], long n)
    {
        List<Long> list = new ArrayList<>();
        for (int i=0 ;i<n ;i++){
            list.add(arr[i]);
        }
        while (list.size()!=1){
            long max = Collections.max(list);
            long min = Collections.min(list);
            list.remove(new Long(max));
            if (list.size() != 1){
                list.remove(new Long(min));
            }

        }
        return list.get(0);
    }
    public static void main(String[] args) {
         PrintTheLeftElement ob = new PrintTheLeftElement();
        long[] array = {8, 1, 2, 9, 4, 3, 7, 5};
        System.out.println(ob.leftElement2(array,array.length));
       // divide(array,0,array.length-1);
       // System.out.println(Arrays.toString(array));

    }
}
