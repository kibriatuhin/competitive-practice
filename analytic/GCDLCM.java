package analytic;

public class GCDLCM {
    static void findGcdLcm(int n , int n2){
        int temp1=n , temp2 = n2;
        while (temp2!=0 ){
            int rem = temp1 % temp2;
            temp1 = temp2;
            temp2 = rem;
        }
        int gcd = temp1;
        int lcm = (n * n2)/gcd;
        System.out.println(gcd + " "+ lcm);
    }
    public static void main(String[] args) {
        findGcdLcm(60,30);
    }
}

class Divisor{
    static void divisor(int n){
        for (int i=1 ; i<= n/2 ; i++){
            if (n%i==0)
                System.out.printf("%d ",i);
        }
        System.out.println(n);
    }
    public static void main(String[] args) {
        divisor(9);
    }
}
class Prime{
    static void primeNumber(int n){
        for (int i=1; i<=n ;i++){
            int count =0;
            for (int j=2 ; j<i/2 ; j++){
                if (i%j==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        primeNumber(20);
    }
}