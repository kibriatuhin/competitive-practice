package analytic;

public class FIboUsingRecursion {
    static void fibonacci(int n , int a , int b){
        if (n==0){
            return;
        }
        int c = a+b;
        System.out.print(c+ " ");
        fibonacci(n-1 , b, c);
    }
    public static void main(String[] args) {
        int a =0, b =1;
        System.out.print(a + " " + b + " ");
        fibonacci(5, a,b);
    }
}
