package geeksforGeeks;

public class LastIndexOfOne {
    public static int lastIndex( String s) {
        for (int i=s.length()-1; i>=0 ; i--){
            if (s.charAt(i) == '1'){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        String s = "00001";
        System.out.println(lastIndex(s));
    }
}
