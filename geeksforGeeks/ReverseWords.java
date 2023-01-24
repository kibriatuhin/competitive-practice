package geeksforGeeks;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWords {
   static String reverseWords(String S)
    {
        String result ="";
        String[] array = S.split("\\.");
        System.out.println(Arrays.toString(array));
        for (int i=array.length-1 ; i>=0 ; i--){
            result += array[i] ;
            if (i==0){
                continue;
            }else {
                result += ".";
            }

        }

        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        reverseWords(s);
    }
}
