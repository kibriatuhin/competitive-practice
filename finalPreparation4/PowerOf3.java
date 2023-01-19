package finalPreparation4;

public class PowerOf3 {
    static boolean power(int n ){
        if (n<1){
            return false;
        }
        while (n%3==0){
            n/=3;
        }
        return n==1;
    }
    static boolean power2(int n){
        return (Math.log(n)/Math.log(3)) % 1==0;
    }
    public static void main(String[] args) {
        System.out.println(power2(9));
    }
}
