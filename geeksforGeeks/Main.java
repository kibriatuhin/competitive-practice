package geeksforGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class ReverseArray{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0 ;i<n; i++){
            int size = sc.nextInt();
            int[]  array= new int[size];
            for (int j=0 ; j<array.length ; j++){
                array[j] = sc.nextInt();
            }
            reverse(array,0,array.length-1);
            System.out.println(Arrays.toString(array));
        }

    }
    static void reverse(int[] array , int st, int ed){
        while (st<=ed){
            int temp = array[st];
            array[st++] = array[ed];
            array[ed--] = temp;
        }

    }
}
class MergeSort{
    static void conquer(int[] array , int st , int mid , int ed){
        int[] marged = new int[ed-st+1];
        int idx1 = st, idx2 = mid+1,m = 0;
        while (idx1<=mid && idx2 <=ed){
            if (array[idx1]<=array[idx2])
                marged[m++] = array[idx1++];
            else
                marged[m++] = array[idx2++];
        }
        while (idx1 <= mid){
            marged[m++] = array[idx1++];
        }
        while (idx2 <= ed){
            marged[m++] = array[idx2++];
        }
        for (int i=0 , j=st ; i<marged.length ; i++,j++){
            array[j] = marged[i];
        }

    }
    static void divide(int[] array , int st , int ed){
        //ed = ed-1;
        if (st>=ed)
            return;
        int mid = st + (ed-st)/2;
        divide(array,st,mid);
        divide(array,mid+1 , ed);
        conquer(array,st,mid,ed);
    }
    static int[] sortArr(int[] arr, int n)
    {
        divide(arr,0,n-1);
        return arr;
        // code here
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2};
        System.out.println(Arrays.toString(sortArr(array,array.length)) );

    }
}
class Sort012{
    public static void sort012(int a[], int n)
    {
        // code here
        int temp , fst=0 , mid =0 , ed=n-1;
        while (mid<=ed){
            switch (a[mid]){
                case 0:
                    temp = a[mid];
                    a[mid++] = a[fst];
                    a[fst++] = temp;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = a[mid];
                    a[mid] = a[ed];
                    a[ed--] = temp;
                    break;
            }
        }
        //System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int[] array = {0 ,2 ,1 ,2 ,0};
        sort012(array,array.length);
    }
}

class SubArray{
    static ArrayList<Integer> subArray(int[] arr,int n ,  int s){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0 ; i<n ; i++){
            int current = 0 , ind = -1;
            for (int j=i ; j<n ; j++){
                current += arr[j];
                if (current == s){
                    ind = j;
                    break;
                }
            }
            if (current == s){
                list.add(i+1);
                list.add((ind+1));
                //System.out.println(i+1 + " " + (ind+1));
                break;
            }

        }
        return list;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,7,5};
        //System.out.println(subArray(array,12));
    }
}

class MoveAllNegative{
    static void moveAll(int[] array , int len){
        int st =0 , ed = len-1, temp ;
        while (st<ed){
            if (array[st]<0){
                temp = array[st];
                array[st++] = array[ed];
                array[ed--] = temp;
            }
            st++;
            
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] array = {1,-1,5,-3,6,9};
        moveAll(array,array.length);
    }
}

class ThreeSum{
    static void threeSum(int[] array , int sum){
       // List<ArrayList> result = new ArrayList<>();

        for (int i=0 ; i< array.length-2; i++){
            for (int j= i+1 ; j< array.length-1 ; j++){
                for (int k= j+1; k< array.length ; k++){
                    if ((array[i]+array[j]+array[k]) == sum){
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] array = {7, 12, 3, 1, 2, -6, 5, -8, 6};
        threeSum(array,0);
    }
}



