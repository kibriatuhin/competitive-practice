package geeksforGeeks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeadersInAnArray {
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0 ;i< n ;i++){
            int  max = i;
            for (int j=i+1 ; j< n ;j++){
                if(arr[max] < arr[j]){
                    max = j;
                }
            }
            list.add(arr[max]);
            if (max == n-2){
                list.add(arr[n-1]);
                break;
            }else {
                i = max;
            }
        }
        //System.out.println(list);
        return list;

    }
    static void printLeaders(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
        {
            int j;
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] <=arr[j])
                    break;
            }
            if (j == size) // the loop didn't break
                System.out.print(arr[i] + " ");
        }
    }
    static ArrayList<Integer> leaders2(int arr[], int n){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[n-1]);
        for(int i=n-2 ; i>=0 ; i--){
            if(arr[i] >= stack.peek())
                stack.push(arr[i]);
        }
        while(!stack.empty()){
            list.add(stack.pop());
        }
        return list;

    }

    public static void main(String[] args) {
        int[] array = {16,17,4,3,5,2};
        printLeaders(array,array.length);
    }

}
