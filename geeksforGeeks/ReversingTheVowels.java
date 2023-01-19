package geeksforGeeks;

import java.util.Arrays;

public class ReversingTheVowels {
    static String modify (String s)
    {
        // your code here
        char[] array = s.toCharArray();
        String restl = "";
        int st=0 , ed = s.length()-1;
        while (st<=ed){
             char c= array[st];
            if ( c == 'a' || c == 'e' || c =='i' || c =='o' || c =='u'){
                char ch = array[ed];
                if (ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch =='u'){
                    char temp = array[st];
                    array[st++] = array[ed];
                    array[ed--] = temp;
                }else {
                   ed--;
                }
            }else {
               st++;
            }
        }
        for (int i=0 ;i < array.length ; i++){
            restl +=array[i];
        }
        return restl;
    }
    public static void main(String[] args) {
        String s = "practice";
        System.out.println(modify(s));
    }
}
