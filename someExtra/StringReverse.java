package someExtra;

public class StringReverse {
    //reverse string ..
    static void reverse(String s){
       String rslt = "";
       char ch;
       for (int i=s.length()-1 ; i>=0 ; i--){
          ch= s.charAt(i);
          rslt+=ch;
       }
        System.out.println(rslt);
    }
    //reverse string using recursion .
    static void reverse2(String s){
        if (s==null || s.length()<=1){
            System.out.println(s);
            return;
        }
        System.out.print(s.charAt(s.length()-1) + " ");
        reverse2(s.substring(0,s.length()-1));
    }

    static boolean checkPalindrom(String s){
        if (s.length() <2){
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }
        return checkPalindrom(s.substring(1,s.length()-1));
    }
    public static void main(String[] args) {
        String s ="aabbaa";
        System.out.println(checkPalindrom(s));
        //System.out.println(s.substring(0,s.length()-1));
    }
}
