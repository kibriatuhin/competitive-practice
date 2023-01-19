package geeksforGeeks;

import java.util.*;

public class IshaanLovesChocolates {
    public static int chocolates(int n, int[] arr) {
        // code here
        Arrays.sort(arr);
        return arr[0];
    }
    public static void main(String[] args) {
        int[] array = {5, 9, 2, 6};
        System.out.println(chocolates(array.length , array));
    }
}
