package finalPreparation3;

import java.util.*;

public class Main {
}

class Searching{
    static void linearSearch(int[] array , int target){
        for (int i=0 ; i<array.length ; i++){
            if (array[i] == target){
                System.out.println(i);
                break;
            }

        }
    }
    static void binarySearch(int[] array , int target){
        int st=0 , ed = array.length-1;
        while (st<=ed){
            int mid = st+ (ed-st)/2;
            if (array[mid] == target){
                System.out.println(mid);
                break;
            } else if (array[mid]<target) {
                st = mid+1;
            }else {
                ed = mid-1;
            }
        }

    }
    public static void main(String[] args) {
        int[] array = {5,6,1,2,9,3};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //linearSearch(array,1);
        binarySearch(array,1);
    }
}

class Sorting {
    static void bubbleSort(int[] array){
        for (int i=0 ; i<array.length-1 ; i++){
            for ( int j=0 ; j< array.length-1-i ; j++){
                if (array[j]> array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    static void selectionSort(int[] array){
        for (int i=0 ; i<array.length-1 ; i++){
            int small = i;
            for (int j=i+1 ; j<array.length ; j++){
                if (array[small]> array[j])
                    small = j;
            }
            int temp = array[i];
            array[i] = array[small];
            array[small] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    static void insertionSort(int[] array){
        for (int i=1 ; i<array.length ; i++){
            int j=i-1 , current = array[i];
            while (j>=0 && array[j]>current){
                array[j+1] = array[j--];
            }
            array[j+1] = current;
        }
        System.out.println(Arrays.toString(array));
    }

    //merged sort
    static void divide(int[] array,int st, int ed){
        if (st >= ed)
            return;
        int mid = st + (ed-st)/2;
        divide(array,st,mid);
        divide(array,mid+1 , ed);
        conquer(array,st,mid,ed);
    }
    static void conquer(int[] array , int st, int mid , int ed){
        int[] merged = new int[ed-st+1];
        int idx1=st,idx2=mid+1 , m=0;
        while (idx1<=mid && idx2<=ed){
            if (array[idx1]<=array[idx2])
                merged[m++] = array[idx1++];
            else
                merged[m++] = array[idx2++];
        }
        while (idx1<=mid){
            merged[m++] = array[idx1++];
        }
        while (idx2<=ed){
            merged[m++] = array[idx2++];
        }
        for (int i=0 , j=st ; i<merged.length ; i++,j++){
            array[j] = merged[i];
        }

    }

    public static void main(String[] args) {
        int[] array = {5,3,9,10,1,4};
        //bubbleSort(array);
        //selectionSort(array);
       // insertionSort(array);
        divide(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}

class TwoThreeSum{
    static void threeSum(int[] array , int target){
        int count =0;
        for (int i=0 ;i<array.length-2 ; i++){
            for (int j=i+1 ; j<array.length-1 ; j++){
                for (int k=j+1; k<array.length ; k++){
                    if ((array[i]+array[j]+array[k]) == target){
                        count++;
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                    }
                }
            }
        }
        System.out.println(count);
    }
    static void threeSum2(int[] array , int target){
        Arrays.sort(array);
        int count =0;
        for (int i=0 ; i<array.length-2 ; i++){
            int j=i+1, ed = array.length-1;
            while (j<ed){
                if ((array[i] + array[j] + array[ed]) == target){
                    System.out.println(array[i] + " " + array[j] + " " + array[ed]);
                    count++;
                    j++;ed--;
                }
                else if ((array[i] + array[j] + array[ed]) < target){
                    j++;
                }else
                    ed--;
            }
        }
        System.out.println(count);
    }
    static void threeSum3(int[] array , int target){
        int count =0;
        for (int i=0 ; i<array.length-2 ; i++){
            Set<Integer> set = new HashSet<>();
            int rem = Math.abs(target-array[i]);
            for (int j=i+1 ; j< array.length; j++){
                if (set.contains(rem-array[j])){
                    System.out.println(array[i] + " " + array[j] + " " + (rem-array[j]));
                    count++;
                }else {
                    set.add(array[j]);
                }
            }
        }
        System.out.println(count);
    }
    static void threeSum4(int[] array , int target){
        int count =0;
        for (int i=0; i< array.length-2;  i++){
            int rem = Math.abs(target-array[i]);
            Map<Integer,Integer> map = new HashMap<>();
            for (int j=i+1; j< array.length ; j++){
                if (map.containsKey(rem-array[j])){
                    count++;
                }else {
                    map.put(array[j] , map.getOrDefault(array[j],-1)+1);
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] array = {12,3,4,1,6,9};
        threeSum4(array,22);
    }
}
class UniqNumber{
    static void search(int[] array){
        int result = 0;
        for (int i=0 ;i<array.length ;i++){
            result ^= array[i];
        }
        System.out.println(result);
    }
    static void search2(int[] array){

        /* int[] newArray = new int[20];
        for (int i=0  ; i< array.length ; i++){
            newArray[array[i]]++;
        }
        System.out.println(Arrays.toString(newArray));
        for (int i=0; i<newArray.length; i++){
            if (newArray[i]%2!=0){
                System.out.println(newArray[i]);
                break;
            }
        } */
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0 ; i<array.length ;i++){
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
        System.out.println(map);
        for (Map.Entry<Integer,Integer> m : map.entrySet()){
            if (m.getValue()%2 !=0){
                System.out.println(m.getKey());
                break;
            }
        }

    }
    public static void main(String[] args) {
        int[] array = {1,2,1,2,5,6,5,6,5,6,5};
        search2(array);
    }
}
class SubArray{
    static void subArray(int[] array){
        int count =0;
        int max = Integer.MIN_VALUE;
        for (int i=0 ; i<array.length ; i++){
            int current = 0;
            for (int j=i ; j< array.length ; j++){
                current+=array[j];
                max = Math.max(current,max);
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        /*int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        subArray(array);*/
        System.out.println(3%7);
    }
}

class RotateArray{
    public static   void reverse(int[] array,int low, int high){
        //int h = array.length-1 , l =0;
        while (low < high){
            int temp = array[high];
            array[high--] = array[low];
            array[low++] = temp;
        }

    }

    public static void rotate(int[] nums , int k){
       // k = k % nums.length;//
        reverse(nums,0,nums.length-1-k);

        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        rotate(array,3);
        System.out.println(Arrays.toString(array));
    }
}