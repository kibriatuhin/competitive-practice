package milonPractice;

public class ReverseString {
    static  void palindrome(String s){
        //tuhin
        String s1 = "";
        for (int i=s.length()-1 ; i>= 0 ; i--){
            char c = s.charAt(i);
            s1 = s1+c;
            System.out.println(s1);
        }
        if (s.equals(s1)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

    static  void palindrome1(String s){
        int st =0 , ed = s.length()-1;
        boolean check = true;
        while (st<ed){
            if (s.charAt(st++) != s.charAt(ed--)){
                check = false;
                break;
            }
        }
        if (check){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        String s1 = "tbtt";
        palindrome1(s1);
    }



}
