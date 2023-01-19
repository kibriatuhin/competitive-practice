package someExtra;

public class CalPower {
    static int calPower(int x , int n){
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        int powerX = calPower(x,n-1);
        return x*powerX;
    }
    public static void main(String[] args) {
        System.out.println(calPower(2,3));
    }
}
