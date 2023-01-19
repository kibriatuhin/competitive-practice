package mamunVai;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
}

class Frequency{
    static void frequency(int[] array){
        boolean[] b = new boolean[array.length];
        for (int i=0 ; i< array.length ; i++){
            if (b[i] == true){
                continue;
            }
            int count =1;
            for (int j=i+1 ; j< array.length ; j++){
                if (array[i] == array[j]){
                  count++;
                  b[j] = true;
                }
            }
            System.out.println(array[i] + " " + count);
        }
    }
    static void frequency1(int[] array){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0 ;i< array.length ; i++){
            map.put(array[i],map.getOrDefault(array[i],0)+1);

        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        frequency1(new int[] {1,2,1,4,2,1,6});
    }
}

class FindingElement{
    static int find(int[] array, int target){
         int st=0 , ed = array.length ;
         while (st<=ed){
             int mid = st + (ed-st)/2;
             if (array[mid] == target){
                 return mid;
             }
             //3 5
             else if (array[mid]<target) {
                 st = mid+1;
             }else {
                 ed = mid -1;
             }
         }
         return -1;
    }
    public static void main(String[] args) {
        System.out.println(find(new int[]{1,2,3,4,5,6},5));
    }
}


class Reverse{
    static void reverse(int[] array){
        int st=0 , ed = array.length-1;
        while (st< ed){
            int temp = array[st];
            array[st++] = array[ed];
            array[ed--] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
    static void reverse(int[] array , int n){
        //base case
        if (n == -1){
            return;
        }
        System.out.print(array[n] + " ");
        reverse(array, n-1);
    }

    //string reverse
    static void reverseString(String st){
        String rs = "";
        char ch;
        for (int i=st.length()-1 ;i>= 0 ; i--){
            ch = st.charAt(i);
            rs +=ch;
        }
        System.out.println(rs);
    }

    static void reverseString2(String st , int n){
        if (n==-1)
            return;
        System.out.print(st.charAt(n) + " ");
        reverseString2(st, n-1);
    }
    static void reverseString3(String st){
        if (st.length() == 0){
            System.out.println(st.charAt(0));
        }
        System.out.print(st.charAt(st.length()-1));
        reverseString(st.substring(0,st.length()-1));
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
       // reverse(array);
        //reverse(array,array.length-1);
        String s = "tuhin";
        reverseString3(s);

    }
}
class Palindrome{
    static boolean palindrome(int number ){
        int temp = number , result = 0;
        while (temp !=0){
            int rem = temp %10;
            result = result *10 + rem;
            temp/=10;
        }
        if (result == number)
            return true;
        else
            return false;
    }
    static boolean palindrome2(String string){
        int st = 0 , ed = string.length()-1;
        boolean check = true ;
        while (st< ed){
            if (string.charAt(st++) != string.charAt(ed--)){
                check = false;
                break;
            }
        }
        return check;
    }

    static boolean palindrome3(String string){
        if (string.length() == 0 || string.length() ==1){
            return true;
        }
        if (string.charAt(0) == string.charAt(string.length()-1))
            return palindrome3(string.substring(1,string.length()-1));
        return false;
    }

    public static void main(String[] args) {
        System.out.println(palindrome3("cabaa"));
    }
}
class SubArray{
    static void subArray(int[] array){
        int count = 0;
        for (int i=0 ; i< array.length ; i++){
            for (int j=i ; j< array.length ; j++){
                for (int k=i ; k <= j; k++){
                    System.out.print( array[k] + " ");
                }
                System.out.println();
            }
        }

       // System.out.println(count);
    }
    public static void main(String[] args) {
        subArray(new int[]{1,2,3});
    }
}

class InsertValue{
    static void insert(int[] array,int key){
        int i;
        for (i = array.length-2 ; (i>=0 && array[i] > key); i--){
            array[i+1] = array[i];
        }
        array[i+1] = key;
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        insert(new int[]{1,2,4,5},3);
    }
}
