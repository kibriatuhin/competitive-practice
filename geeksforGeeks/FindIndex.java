package geeksforGeeks;

import java.util.Arrays;

public class FindIndex {
    static int[] findIndex(int a[], int N, int key)
    {
        //code here.
        int count =0;
        int[] array = new int[2];
        for (int i=0 ;i<N;i++){
            if (a[i] == key){
                array[0] = i;
                count++;
                break;
            }
        }
        for (int i=N-1 ;i>=0 ;i--){
            if (a[i] == key){
                count++;
                array[1] = i;
                break;
            }
        }
        if (count==0){
            array[0] = -1;
            array[1] = -1;
            return array;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5};
        System.out.println(Arrays.toString(findIndex(array,array.length , 5)));
    }
}
