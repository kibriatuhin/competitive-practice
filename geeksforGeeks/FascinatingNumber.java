package geeksforGeeks;

public class FascinatingNumber {
    static boolean fascinating(long n) {
        // code here
        String n1 = ""+n;
        String n2 = "" + n*2;
        String n3 = ""+n*3;
        String rslt = n1+n2+n3;
        System.out.println(rslt);
        if (rslt.contains("1") && rslt.contains("2") && rslt.contains("3") && rslt.contains("4") && rslt.contains("5") && rslt.contains("6") && rslt.contains("7")
                && rslt.contains("8") && rslt.contains("9") && rslt.length()==9){

            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(fascinating(192));
    }
}
