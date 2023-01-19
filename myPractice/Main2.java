package myPractice;

import java.util.*;

public class Main2 {



    public static void main(String[] args) {

    }
}
class DupplicateValueFind{
    static void find(int[] array){
        boolean[] visited = new boolean[array.length];
        for (int i=0 ; i< array.length ; i++){
            if (visited[i])
                continue;
            int count=1;
            for (int j=i+1; j< array.length ;j++){
                if (array[i] == array[j]){
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(array[i] + " " + count);
        }
    }
    static void find2(int[] array){
        Map<Integer,Integer> map = new HashMap<>() ;

        for (int i=0 ; i< array.length ;i++){
            map.put(array[i], map.getOrDefault(array[i],0)+1 );
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        int[] array = {1,6,1,3,6,1,3,8,4};
        find2(array);
    }
}

class DupplicateValRemove{
    static void remove(int[] array){
        int index = -1;
        boolean b = true;
        for (int i=0; i<array.length; i++){
            for (int j= i+1; j<array.length ; j++){
                if (array[i] == array[j]){
                    index= j;
                    b= false;
                    break;
                }
            }
            if (b == false)
                break;
        }

        for (int i=index; i< array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = -1;
        System.out.println(Arrays.toString(array));

    }

    static void remove2(int[] array){
        Set<Integer> set = new HashSet<>();
        int index =-1;
        for (int i=0 ; i< array.length ;i++){
            if (set.contains(array[i])){
                index = i;
                break;
            }else
                set.add(array[i]);
        }
        for (int i=index; i< array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = -1;
        System.out.println(Arrays.toString(array));
    }
    //sorted array
    static void remove3(int[] array){
        int j=0;
        for (int i=0 ; i< array.length-1; i++){
            if (array[i] != array[i+1])
                array[j++] = array[i];
        }
        array[j] = array[array.length-1];
        array[array.length-1] = -1;
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,4,5,6};
        remove3(array);
    }
}

class InsertValue{
    static void insertValue(int[] array,int target,int index){
        for (int i=array.length-1; i>index; i--){
            array[i] = array[i-1];
        }
        array[index] = target;
        System.out.println(Arrays.toString(array));
    }
    static void insertValue2(int[] array,int target){
        int i;
        for (i=array.length-2;(i>=0 && array[i]>target) ; i--){
            array[i+1] = array[i];
        }
        array[i+1] = target;

        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array ={1,2,3,4,6,7,8};
        insertValue2(array,5);
    }
}

class Searching{
    static int binarySearch(int[] array , int target){
        int st =0,ed = array.length-1;
        //int m = -1;
        while (st <= ed){
            int mid =  st + (ed-st)/2;
            if (array[mid] == target){
                return mid;
            }
            else if (array[mid]> target) {
                ed = mid-1;
            }else
                st = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(binarySearch(array,4));
    }
}
class TwoSumPractice{
    static void twoSum(int[] array,int target){
        for (int i=0 ; i< array.length; i++){
            for (int j=i+1 ; j< array.length ; j++){
                if ((array[i] + array[j]) == target){
                    System.out.println(i + " " + j);
                }
            }
        }

    }
    static void twoSum2(int[] array , int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0 ; i< array.length ; i++){
            int rem = Math.abs(target- array[i]);
            if (map.containsKey(rem)){
                System.out.println(i + " " + map.get(rem));
            }else
                map.put(array[i],i);
        }
    }
    public static void main(String[] args) {
        int[] array = {1,9,5,5,8,3};
        twoSum(array,10);
        System.out.println("---------------------");
        twoSum2(array,10);
    }
}

class MaximumSubArray{
    static void maxSum(int[] array ){
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

    //
    static void maxSum2(int[] array){
        int max = Integer.MIN_VALUE;
        int current =0;
        for (int i=0 ; i<array.length ; i++){
            current+= array[i];
            if (current> max)
                max = current;
            if (current <0){
                current=0;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        maxSum2(array);
    }
}
class PrifixSumPractice{

    public static void main(String[] args) {

    }
}

class GCDLCM{
    //static void GCD(int n,)
    public static void main(String[] args) {
        method(null);
    }
    /*static void method(String s){
        System.out.println("s");
    }*/
    static void method(Object o){

    }

}
