package geeksforGeeks;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {
   static String longestCommonPrefix(String arr[], int n){
       Map<Integer,Integer> map = new HashMap<>();
       int max = arr[0].length();
       for(int i=0 ; i<n ;i++){
           int len = arr[i].length();
           map.put(len,i);
           max = Math.min(len,max);
       }
       String st = arr[map.get(max)];
       boolean check ;
       for (int i=0 ;i<st.length();i++){
           String s = st.substring(0,st.length()-i);
           check = true;
           for(int j=0 ;j<n ;j++){
               int index = arr[j].indexOf(s);
               if (index != 0){
                   check = false;
                   break;
               }
           }
           if (check){
               return s;
           }

       }
        return  "-1";
    }
    public static void main(String[] args) {
        String[] array = {"hello", "world"};
        System.out.println(longestCommonPrefix(array,array.length));
    }
}
