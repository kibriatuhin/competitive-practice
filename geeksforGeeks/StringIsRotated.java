package geeksforGeeks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringIsRotated {
    static void reverse(char[] array , int st, int ed){
        while(st<ed){
            char temp = array[st];
            array[st++] = array[ed];
            array[ed--] = temp;
        }
    }
    public static boolean isRotated(String str1, String str2)
    {
        Map<Character , Integer> map = new HashMap<>();
        for (int i=0 ;i<str1.length() ; i++){
            map.put(str1.charAt(i),map.getOrDefault(str1.charAt(i),0)+1);
        }
        System.out.println(map);
        boolean b = false;
        char c = Character.MIN_VALUE;
        for (Map.Entry<Character,Integer> val : map.entrySet() ){
            if (val.getValue() == 2){
                c = val.getKey();
                b = true;
            }
        }
        if (!b){
            return false;
        }
        int index2 = str1.lastIndexOf(c);
        int index1 = str1.indexOf(c);
        System.out.println(index1 + " " + index2);
        char[] array = str1.toCharArray();
        reverse(array,0,index1-1);
        reverse(array,index2+1,str1.length()-1);
        reverse(array,0,str1.length()-1);
        System.out.println(Arrays.toString(array));
        String res = "";
        for (char ch : array){
            res+=ch;
        }
        if (res.equals(str2)){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {

        String st1 = "rellnmpapqfwkhop";
        String st2 = "llnmpapqfwkhopre";
        System.out.println(isRotated(st1,st2));

    }
}
