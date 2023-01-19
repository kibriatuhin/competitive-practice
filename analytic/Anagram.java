package analytic;

public class Anagram {
    static boolean anagram(String s1, String s2){
        if (s1.length() != s2.length())
            return false;
        char[] ch = s1.toCharArray();
        int count=0;
        for (int i=0 ; i< ch.length ; i++){
            if (s2.contains(Character.toString(ch[i])))
                continue;
            else {
                count++;
                break;
            }
        }
        if (count > 0)
            return false;
        else
            return true;
    }
    static boolean anagram1(String s, String t){
        boolean b= true;
        if (s.length() != t.length())
            return false;
        for (int i=0 ; i< s.length() ; i++){
            if (t.contains(Character.toString(s.charAt(i))))
                continue;
            else{
                b= false;
                break;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        String s1 = "ICT";
        String s2 = "CTI";
        System.out.println(anagram1(s1,s2));
    }
}
