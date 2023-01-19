package geeksforGeeks;

public class ReplaceAll0With5 {
   static int convertfive(int num) {
        String val = Integer.toString(num);
        char[] ch = val.toCharArray();
        for (int i=0 ; i< ch.length ; i++){
           if (ch[i] == '0'){
               ch[i] = '5';
           }
        }
        String result = "";
        for (int i=0 ; i< ch.length ; i++){
            result += ch[i];
        }
       //System.out.println(result);
        return Integer.parseInt(result);
    }
    public static void main(String[] args) {
       int n = 1004;
        System.out.println(convertfive(n));
    }
}
