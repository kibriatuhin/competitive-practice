package someExtra;

public class StringToBinary {
    static void binary(int n){
        int[] b = new int[40];
        int ind =0;
        while (n != 0){
            b[ind++] = n %2;
            n/=2;
        }
        for (int i=b.length-1 ; i>=0  ; i--){
            System.out.print(b[i] +" ");
        }
    }
    public static void main(String[] args) {
        binary(10);
    }
}
