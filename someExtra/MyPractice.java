package someExtra;

public class MyPractice {
    static void sumOfDigit(int n , int sum){
        int rem = n%10;
        sum +=rem;
        if (n ==0 ){
            System.out.println(sum);
            return;
        }
        sumOfDigit(n/10,sum);

    }

    static int calPower(int x,int n){
        if (x==0){
            return 0;
        }
        if (n==0){
            return 1;
        }
        int cal = calPower(x,n-1);
        return cal*x;
    }
    public static void main(String[] args) {
       // sumOfDigit(121,0);
        System.out.println(calPower(2,3));;
    }
}
