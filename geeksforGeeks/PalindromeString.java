package geeksforGeeks;

public class PalindromeString {
    static int isPalindrome(String S) {
        int st=0 , ed = S.length()-1;
        while (st<ed){
            if (S.charAt(st) != S.charAt(ed)){
                return 0;
            }
            st++;ed--;
        }
        return 1;
    }
    public static void main(String[] args) {
        String s = "abba";
        System.out.println(s.lastIndexOf('a'));
    }
}
