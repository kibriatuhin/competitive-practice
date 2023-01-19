package analytic;

public class FirstUniqChar {
    public static int firstUniqChar(String s) {
        int index = 0;
        char[] ch = s.toCharArray();
        for (char c : ch){
            if (s.indexOf(c) == s.lastIndexOf(c)){
                index = s.indexOf(c);
                break;
            }else
                index = -1;
        }
        return index;
    }
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
