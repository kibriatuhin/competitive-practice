package geeksforGeeks;

public class RemoveSpaces {
   static String modify(String S)
    {
        // your code here
        String[] s2 = S.split(" ");
        String result = "";
        for (int i=0 ; i<s2.length ;i++){
            result+=s2[i];
        }
        //System.out.println(result);
        return result;

    }
    public static void main(String[] args) {
        modify("geeks  for geeks");
    }
}
