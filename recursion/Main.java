package recursion;

public class Main {
    static void sumOfDigit(int n , int s){
        if (n==0){
            System.out.println(s);
            return;
        }
        int rem = n%10;
        s+=rem;
        sumOfDigit(n/10 , s);
    }
    static int power(int x , int n){
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        int val = power(x,n-1);
        return x*val;
    }
    static void fibonacci(){

    }
    public static void main(String[] args) {
        //sumOfDigit(121,0);
        System.out.println(power(3,2));
    }
}
