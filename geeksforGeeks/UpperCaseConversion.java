package geeksforGeeks;

public class UpperCaseConversion {

    public static String transform(String s)
    {
        // code here
        String[] array = s.split(" ");
        String finalResult = "";

        for (int i=0 ; i<array.length ; i++){
            String rslt = "";
            char c = array[i].charAt(0);
            rslt +=c;
            String result = rslt.toUpperCase();
            result+=array[i].substring(1);
            finalResult+=result;
            finalResult+=" ";
        }
        //System.out.println(finalResult);
        return finalResult;
    }
    public static void main(String[] args) {
        String s = "i Love tuhin";

        transform(s);
    }
}
