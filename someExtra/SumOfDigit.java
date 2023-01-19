package someExtra;

public class SumOfDigit {
    static void sum(int n , int s ){

        if (n == 0){
            System.out.println(s);
            return;
        }
        int rem = n%10;
        s +=rem;
        n/=10;
        sum(n,s);

    }
    public static void main(String[] args) {
        sum(121,0);
    }

}
class XorPractice{
    static void xorPractice(int[] array){
        int result = 0;
        for (int i=0 ; i< array.length ; i++){
            result ^= array[i];
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        xorPractice(new int[]{1,2,1,2,5});
    }
}