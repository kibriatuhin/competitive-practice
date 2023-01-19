package geeksforGeeks;

import java.util.Arrays;

public class DeleteAlternateCharacters {
    static String delAlternate(String S) {
        // code here
        char[] array = S.toCharArray();
        for (int i=1 ;i<array.length;i+=2){
            array[i] = '1';
        }
       // System.out.println(Arrays.toString(array));
        String result = "";
        for (char c : array){
            if (c != '1'){
                result+=c;
            }
        }
       // System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        delAlternate("Geeks");
    }
}
