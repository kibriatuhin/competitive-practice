package geeksforGeeks;

public class JavaStrings {
    static String conRevstr(String S1, String S2) {

        String s2 = S1.concat(S2);
        String result = "";
        for (int i=s2.length()-1 ;i>=0 ;i--){
            result +=s2.charAt(i);
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        String s1 ="Geeks" ,s2 ="forGeeks";
        conRevstr(s1,s2);
    }
}
