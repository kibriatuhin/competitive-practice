package geeksforGeeks;

import java.util.ArrayList;

public class FirstAndLastOccurrencesOfX {
    static void practice(int[] array, int n,int x){
        int st =0 , ed = n-1;
        while (st<=ed){
            int mid = st+(ed-st)/2;
            if (array[mid] ==x ){
                System.out.println(mid);
                break;
            }else if (array[mid] < x){
                st = mid+1;

            }else {
                ed = mid-1;
            }
        }

    }
    static ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> list = new ArrayList<>();
        int st = 0 , ed = n-1;
        while (st <=ed){
            if (arr[st]<x)
                st++;
            else if (arr[ed]>x) {
                ed--;
            } else if (arr[st] == x && arr[ed] == x) {
                list.add((long)st);
                list.add((long)ed);
                break;
            }
        }
        if (list.size() ==0){
            list.add((long)-1);
            list.add((long)-1);
            return list;
        }else
            return list;

    }
    public static void main(String[] args) {
        long[] array = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        System.out.println( find(array,array.length , 5));;
    }
}
