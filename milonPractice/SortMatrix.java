package milonPractice;

import java.util.Arrays;

public class SortMatrix {
    static void conquer(int[] array , int st , int mid , int ed){
        int[] marged = new int[ed-st+1];
        int idx=st ;
        int idx2 = mid+1;
        int m=0;
        while (idx<=mid && idx2 <=ed){
            if (array[idx]<= array[idx2]){
                marged[m++] = array[idx++];
            }else {
                marged[m++] = array[idx2++];
            }
        }
        while (idx<=mid){
                marged[m++] = array[idx++];
        }
        while (idx2<=ed){
            marged[m++] = array[idx2++];
        }

        for (int i=0 , j=st ; i< marged.length ; i++,j++){
            array[j] = marged[i];
        }
    }

    static void divide(int[] array , int st , int ed){

        if (st>=ed){
            return;
        }
        //work
        int mid = st + (ed-st)/2;
        divide(array, st , mid);
        divide(array,mid+1 , ed);
        conquer(array, st, mid , ed);

    }
    public static void main(String[] args) {
        int[] array = {5,21,2,1,3};
        divide(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
