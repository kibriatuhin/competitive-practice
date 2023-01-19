package analytic;

public class PrimeNumber {
    static boolean isPrime(int n){
        int count =0;
        for (int i=2 ; i< n ;i++){
            if (n%i==0){
                count++;
                break;
            }
        }
        if (count> 0)
            return false;
        else
            return true;
    }
    static void isPrime2(int n){
        int count =0 ;
        for (int i=1 ; i<= n ; i++){
            count=0;
            for (int j=2 ; j<= i/2 ;j++){
                if (i%j ==0){
                    count++;
                    break;
                }
            }
            if (count ==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        isPrime2(10);
    }
}
