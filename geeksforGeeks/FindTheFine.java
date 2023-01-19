package geeksforGeeks;

public class FindTheFine {
    public static long totalFine( long n, long date, long car[], long fine[])
    {
        long sum =0;
        if (date %2==0){
            for (int i=0 ;i<n ;i++){
                if (car[i] %2 !=0){
                    sum +=fine[i];
                }
            }
        }else {
            for (int i=0 ;i<n ;i++){
                if (car[i] %2 ==0){
                    sum +=fine[i];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        long[] array = {2375, 7682, 2325, 2352};
        long[] array2 = {250, 500, 350, 200};
        System.out.println(totalFine(array.length , 12,array,array2));
    }
}
