package geeksforGeeks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOfCamelCaseCharacters {
   static int countCamelCase (String s)
    {
        // your code here
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(s);
        int count =0;
        while (matcher.find()){
            count++;
        }
       // System.out.println(count);
        return count;

    }
    static int countCamelCase2 (String s){
       int count = 0;
       for (int i=0 ; i<s.length() ; i++){
           if (s.charAt(i)>=65 && s.charAt(i)<=91){
               count++;
           }
       }
        //System.out.println(count);
       return count;
    }
    public static void main(String[] args) {
       countCamelCase2("ckjkUUYII");
    }
}
