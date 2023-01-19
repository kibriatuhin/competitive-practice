package geeksforGeeks;

public class ReverseString {
    static String revStr(String S) {
        String st = "";

        for (int i=S.length()-1 ; i>=0 ; i--){
            st+= S.charAt(i);
        }
        return st;
    }



    public static void main(String[] args) {
        System.out.println(revStr("TUhin"));
    }
}
