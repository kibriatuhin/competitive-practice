package geeksforGeeks;

public class RemoveVowelsFromString {

    static String removeVowels(String S) {
        // code here
        String[] array = S.split(" ");
        String result = "";
        for (int i=0 ;i< array.length ; i++){
            char[] ch = array[i].toCharArray();
            for (int j=0 ;j<ch.length  ; j++){
                if (ch[j] == 'a' || ch[j] == 'e'
                    || ch[j] == 'i' || ch[j] =='o' || ch[j] == 'u'){
                    ch[j] = '1';
                }
            }
            for (char c : ch){
                if (c != '1'){
                    result+=c;
                }
            }
            result+=" ";
        }
        System.out.println(result);
        return result;

    }
    static String removeVowels2(String S){
        String result = "";
        char[] ch = S.toCharArray();
        for (int j=0 ;j<ch.length  ; j++){
            if (ch[j] == 'a' || ch[j] == 'e'
                    || ch[j] == 'i' || ch[j] =='o' || ch[j] == 'u'){
                ch[j] = '1';
            }
        }
        for (char c : ch){
            if (c != '1'){
                result+=c;
            }
        }
        //System.out.println(result);
        return result;

    }
    static String removeVowels4(String S){
        StringBuilder builder = new StringBuilder(S);
        for (int i=0 ; i< S.length() ; i++){
            if (S.charAt(i) == 'a' || S.charAt(i) == 'e'
                    || S.charAt(i) == 'i' || S.charAt(i) =='o' || S.charAt(i) == 'u'){
                int n = builder.indexOf(String.valueOf(S.charAt(i)));
                builder.deleteCharAt(n);
            }
        }
        System.out.println(builder);
        return builder.toString();
    }
    static String removeVowels3(String S){
        String result ="";
        for (int i=0  ;i< S.length() ; i++){
            if (S.charAt(i) == 'a' || S.charAt(i) == 'e'
                    || S.charAt(i) == 'i' || S.charAt(i) =='o' || S.charAt(i) == 'u'){
                continue;
            }else {
                result+=S.charAt(i);
            }
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        String s = "welcome to geeksforgeeks";
        removeVowels3(s);
    }
}
