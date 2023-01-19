package myPractice;

import java.util.*;

public class Main {

}
class BubbleSort{
    static void bubbleSort(int[] array){
        boolean b ;
        for (int i=0 ; i< array.length-1 ; i++){
            b = false;
            for (int j=0 ; j< array.length-1-i ; j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    b = true;
                }
            }
            if (b== false){
                break;
            }

        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        bubbleSort(new int[]{15,9,10,1,2,4});
    }
}
class SelectionSort{
    static void selectionSort(int[] array){
        for (int i=0 ; i< array.length-1 ; i++){
            int current  = i;
            for (int j=i ; j< array.length ; j++){
                if (array[current]> array[j])
                    current = j;
            }
            int temp = array[current];
            array[current] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        selectionSort(new int[]{15,9,10,1,2,4});
    }
}

class InsertionSort{
    static void insertionSort(int[] array){
        for (int i=0 ; i< array.length ; i++){
            int current = array[i];
            int j= i-1;
            while (j>=0 && array[j]> current){
                array[j+1] = array[j--];
            }
            array[j+1]  = current;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        insertionSort(new int[]{15,9,10,1,2,4});
    }
}

class DupplicateFind{
    //o(n2)
    static void dupplicate(int[] array){
        for (int i=0 ; i< array.length ; i++){
            for (int j=i+1 ; j< array.length ; j++){
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    break;
                }
            }
        }
    }

    //using set
    static void dupplicate2(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int i=0 ; i< array.length ; i++){
            if (set.contains(array[i])){
                System.out.println(array[i]);
            }
            set.add(array[i]);
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,2,1,3,5};
        dupplicate2(array);
    }
}

class DupplicateValueRemove{
    static void dupplicateRemove(int[] array){
        int index = -1;
        for (int i=0 ; i< array.length ; i++){
            for (int j=i+1 ; j< array.length ; j++){
                if (array[i]== array[j]){
                    index = j;
                    break;
                }
            }
        }

        for (int i=index ; i< array.length-1 ; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = -1;

        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] array = {1,3,4,1,6,5};
        dupplicateRemove(array);
    }
}

class FindElement{
    static void findElement(int[] array , int target){
        for (int i=0 ; i< array.length ; i++){
            if (array[i] == target){
                System.out.println(i);
                break;
            }
        }
    }
    static void findElement2(int[] array , int target){
        int st=0 , ed = array.length-1;
        while (st<=ed){
            int mid = st + (ed-st)/2;
            if (array[mid] == target){
                System.out.println(mid);
                break;
            }else if (array[mid]<target)
                st = mid+1;
            else
                ed = mid-1;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        findElement2(array,5);
    }
}
class TwoSum{
    static void twoSum(int[] array ,int target){
        for (int i=0 ;i< array.length ; i++){
            for (int j=i+1 ; j< array.length ; j++){
                if ((array[i] + array[j]) == target){
                    System.out.println(i + " " + j);
                }
            }
        }
    }
    static void twoSum2(int[] array , int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0 ; i< array.length ; i++){
            int rem = Math.abs(target - array[i]);
            if (map.containsKey(rem)){
                System.out.println(map.get(rem) + " " + i);
            }else {
                map.put(array[i],i);
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {2,6,5,3,9,1};
        twoSum2(array,8);
    }
}

class MergedArray{
    static void  merged(int[] array1 , int[] array2){
        int[] merged = new int[array1.length+ array2.length];
        int idx1  = 0,idx2 = 0 , m =0;
        while (idx1<array1.length){
            merged[m++] = array1[idx1++];
        }
        while (idx2< array2.length){
            merged[m++] = array2[idx2++];
        }

        System.out.println(Arrays.toString(merged));
    }
    public static void main(String[] args) {
        int[] array1 = {4,2,1,7,5} ;
        int[] array2 = {5,8,1} ;
        merged(array1,array2);
    }
}

class ReverseString{
    static void reverseString(String st){
        String rs = "";
        char c;
        for (int i=st.length()-1 ; i>= 0 ; i--){
            c = st.charAt(i);
            rs+=c;
        }
        System.out.println(rs);
    }
    static void reverseString1(String st){
        char[]  ch = st.toCharArray();
        int s=0 , e= ch.length-1;
        while (s< e){
            char temp = ch[s];
            ch[s++] = ch[e];
            ch[e--] = temp;
        }
        System.out.println(Arrays.toString(ch));
    }
    //recursion
    static void reverseString2(String st , int n){
        if (n==-1)
            return;
        System.out.print(st.charAt(n));
        reverseString2(st,n-1);
    }
    static void reverseString3(String st ){
        //if (st == )
        int len = st.length();
        if (len ==0){
            return;
        }
        System.out.print(st.charAt(len-1) + " ");
        reverseString3(st.substring(0,len-1));
    }
    public static void main(String[] args) {
        String s = "";
       // System.out.println(s);
       // reverseString2(s,s.length()-1);
        reverseString3("tuhin");
    }
}

class Palindrome{
    static void palinedrome(String st){
        String rs = "";
        char c;
        for (int i=st.length()-1 ; i>=0 ; i--){
            c = st.charAt(i);
            rs +=c;
        }
        if (rs.equals(st)){
            System.out.println("palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }

    static void palinedrome2(String st){
        int s = 0, ed = st.length()-1;
        boolean ch = true;
        while (s<ed){
            if (st.charAt(s++) != st.charAt(ed--)){
                ch = false;
                break;
            }
        }
        System.out.println(ch);
    }

    static boolean palinedrome4(String st){
        if (st.length() ==0 || st.length()==1)
            return true;
        if (st.charAt(0) == st.charAt(st.length()-1))
            return palinedrome4(st.substring(1,st.length()-1));
        return false;
    }
    public static void main(String[] args) {
        String s = "aabbaa";
        System.out.println(palinedrome4(s));
    }
}

class SubArraySum{
    static void subArraySum(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i=0 ; i< array.length ; i++){
            int currentSum = 0;
            for (int j=i ; j< array.length ; j++){
                currentSum +=array[j];
                max = Math.max(currentSum,max);
            }
        }
        System.out.println(max);
    }
    static void subArraySum1(int[] array){
        int maxSum = 0,currentSum = 0;
        for (int i=0 ; i< array.length ; i++){
            currentSum+=array[i];
            if (currentSum> maxSum)
                maxSum = currentSum;
            if (currentSum<0)
                currentSum =0;
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        subArraySum1(array);
    }
}

class PrifixSum{
    static void prifixSum(int[] array){
        int[] prifixSum = new int[array.length];
        prifixSum[0] = array[0];
        for (int i=1 ;i< array.length ; i++){
            prifixSum[i] = prifixSum[i-1] + array[i];
        }
        System.out.println(Arrays.toString(prifixSum));
        int i=2,j=3;
        System.out.println((prifixSum[j] - prifixSum[i-1]));
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        prifixSum(array);
    }
}

class SumNumber{
    static void sum(int n){
        int sum =0;
        for (int i=1; i<=n ; i++){
            sum += i;

        }
        System.out.println(sum);
    }
    static void sum2(int n){
        System.out.println((n*(n+1))/2);
    }
    static int sum3(int n){
        if (n==1)
            return 1;
        int s = sum3(n-1);
        return s+n;
    }
    static int power(int x,int n){
        if (n==0)
            return 1;
        int s = power(x,n-1);
        return x*s;
    }
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
}