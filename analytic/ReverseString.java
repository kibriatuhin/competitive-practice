package analytic;

public class ReverseString {
    static void reverse(String st){
        String s2 = "";
        char ch;
        for (int i=st.length()-1 ; i>=0; i--){
            ch = st.charAt(i);
           // s2 = s2.concat(Character.toString(ch));
            s2+=ch;

        }
        System.out.println(s2);
    }

    public static void main(String[] args) {
        reverse("tuhin");
    }
}
