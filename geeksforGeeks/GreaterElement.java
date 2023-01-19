package geeksforGeeks;

import java.util.Arrays;

public class GreaterElement {
     void conquer(long[] array , long st , long mid , long ed){
        long[] merged = new long[(int) ed-(int) st+1];
        long idx1=st,idx2=mid+1,m=0;
        while (idx1<=mid && idx2<=ed){
            if (array[(int)idx1] <=array[(int) idx2]){
                merged[(int) m++] = array[(int)idx1++];
            }else {
                merged[(int) m++] =array[(int) idx2++];
            }
        }

        while (idx1<=mid){
            merged[(int) m++] = array[(int)idx1++];
        }
        while (idx2<=ed){
            merged[(int) m++] =array[(int) idx2++];
        }

        for (long i = 0 , j=st ; i< merged.length ;i++,j++){
            array[(int) j] = merged[(int) i];
        }
    }
     void divide (long[] array , long st , long ed){
        if (st >= ed)
            return;
        long mid = st+(ed-st)/2;
        divide(array,st,mid);
        divide(array,mid+1 , ed);
        conquer(array,st,mid,ed);
    }
    public  long[] findElements( long a[], long n)
    {
        // Your code goes here
        divide(a,0,n-1);
        long[] array = new long[(int)n-2];
        for (int i=0 ;i<a.length-2 ; i++){
            array[i] = a[i];
        }
        //System.out.println(Arrays.toString(array));
        return array;
    }
    public static void main(String[] args) {

        long[] array = {4,2,9,1};
        //findElements(array,array.length);
       // divide(array,0,array.length-1);
       // System.out.println(Arrays.toString(array));
    }
}
