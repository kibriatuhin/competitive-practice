package analytic;

public class Recursion {

    //print sum
    static void printSum(int st, int ed , int sum){
        //base case
        if (st == ed){
            sum +=st;
            System.out.println(sum);
            return;
        }
        sum +=st;
        printSum(st+1, ed , sum);
    }

    //factorial
    static void factorial(int n , int fact){
        //base case
        if (n ==0){
            System.out.println(fact);
            return;
        }
        fact *= n;
        factorial(n-1 , fact);
    }
    //factorial
    static int factorial2(int n){
        if (n==1){
            return 1;
        }
        int fact = factorial2(n-1);
        int fact_n = n * fact;
        return fact_n;
    }

    //print array
    static void printArray(int[] array , int n){
        if (n== array.length)
            return;
        System.out.println(array[n]);
        printArray(array,n+1);
    }

    //arraySUm
    static void printArraySum(int[] array , int n , int sum){
        if (n==array.length){
            System.out.println(sum);
            return;
        }
        sum+=array[n];
        printArraySum(array, n+1, sum);
    }
    //reverse array


    public static void main(String[] args) {
        //factorial(5,1);
        //printArray(new int[]{1,2,3,4,5} , 0);
        int[] array = {1,2,3,4};
        printArraySum(array,0 , 0);
    }
}
