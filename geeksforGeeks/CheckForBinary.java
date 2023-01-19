package geeksforGeeks;

public class CheckForBinary {
   static boolean isBinary(String str)
    {
        //Your code here
        int st =0 , ed = str.length()-1;
        while (st<ed){
            if ((str.charAt(st) != '0' && str.charAt(st) != '1'  ) || (str.charAt(ed) != '1' && str.charAt(ed) != '0')){
                return false;
            }
            st++;ed--;

        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isBinary("75"));
        //String s = "101";
       // System.out.println(s.charAt(0) == '0');

    }
}
