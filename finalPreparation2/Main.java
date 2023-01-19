package finalPreparation2;


import javax.swing.plaf.IconUIResource;
import java.util.*;

public class Main {

    public static void main(String[] args) {

    }
}
class ThreeSum{
    static void sum(int[] array , int sum ){
        int count =0 ;
        for (int i=0 ;i<array.length-2 ; i++){
            for (int j=i+1 ; j<array.length-1 ; j++){
                for (int k=j+1 ; k<array.length ; k++){
                    if ((array[i]+array[j]+array[k]) == sum){
                        count++;
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                    }
                }
            }
        }
        System.out.println(count);
    }
    static void sum2(int[] array , int sum ){
        int count =0 ;
        for (int i=0 ; i<array.length ; i++){
            Set<Integer> set = new HashSet<>();
            int current = Math.abs(sum-array[i]);
            for (int j = i+1 ; j< array.length ; j++){
                if (set.contains(current-array[j])){
                    System.out.println(array[i] + " " + array[j] + " "  + (current-array[j]));
                    count++;
                }
                set.add(array[j]);
            }

        }
        System.out.println(count);
    }

    static void sum3(int[] array , int sum ){
        for (int i=0 ;i<array.length ; i++){
            Map<Integer,Integer> map = new HashMap<>();
            int current = Math.abs(sum-array[i]);
            for (int j=i+1  ; j< array.length ; j++){
                if (map.containsKey(current-array[j])){
                    System.out.println(array[i] + " " + array[j] + " "  +(current-array[j]) );
                }
                map.put(array[j], map.getOrDefault(array[j],0)+1);
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {12, 3, 4, 1, 6, 9};
        sum3(array,24);
    }
}
class StringReverse{
    static void reverse(String s){
        String[] array = s.split(" ");
        String rs ="";
        for (int i = array.length-1 ; i>=0 ; i--){
            rs+=array[i] + " ";
        }
        System.out.println(rs.trim());
    }
    public static void main(String[] args) {
        reverse("I Love Java");
    }
}
class Freequency{
    static void freequency(int[] array){
        boolean[] b = new boolean[array.length];
        for (int i=0 ; i<array.length ; i++){
            if (b[i])
                continue;
            int count =1;
            for (int j=i+1; j<array.length ; j++){
                if (array[i] == array[j]){
                    b[j] = true;
                    count++;
                }

            }
            System.out.println(array[i] + "--> " + count);
        }
    }
    static void freequency2(int[] array){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0 ; i<array.length ; i++){
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        int[] array = {2,1,2,3,1,3,5};
        freequency(array);
    }
}
class Dupplicate{
    static void dupplicate(int[] array){
        boolean[] visited = new boolean[array.length];
        for (int i=0 ; i<array.length ; i++){
            if (visited[i])
                continue;
            int count = 1;
            for (int j=i+1; j<array.length ; j++){
                if (array[i] == array[j]){
                   count++;
                   visited[j] = true;
                }
            }
            if (count>1)
                System.out.println(array[i]);
        }
    }
    static void dupplicate2(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int i=0 ; i<array.length ; i++){
            if (set.add(array[i]) == false){
                System.out.println(array[i]);
            }
        }
    }
    static void dupplicate3(int[] array){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0  ;i<array.length ; i++){
            if (map.containsKey(array[i])){
                System.out.println(array[i]);
            }else
                map.put(array[i],0);
        }
    }

    static void dupplicate4(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans= ans ^ arr[i] ;
        }
        for(int i=0;i<=arr.length;i++){
            ans= ans ^ i;
        }
        System.out.println(ans);
    }
   static int DuplicateNumber(int[] arr, int size){
        int ans=0;
        for(int i=0;i<size;i++){
            ans= ans ^ arr[i] ;
        }
        for(int i=0;i<=size-2;i++){
            ans= ans ^ i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] array = {8,6,5,1,6,9};
        System.out.println(DuplicateNumber(array,array.length));
        //System.out.println(5^6);
    }
}
class RemoveDupplicate{
    static void removeDupplicate(int[] array){
        int dup = -1;
        for (int i=0 ; i<array.length ; i++){
            for (int j=i+1 ; j<array.length ; j++){
                if (array[i] == array[j]){
                    dup = j;
                    break;
                }
            }
        }
        if (dup!=-1){
            for (int i=dup  ; i<array.length-1 ; i++){
                array[i] = array[i+1];
            }
            array[array.length-1] = -1;
        }
        System.out.println(Arrays.toString(array));

    }
    //using set
    static void removeDupplicate2(int[] array){
        int dup = -1;
        Set<Integer> set = new HashSet<>();
        for (int i=0 ; i<array.length ; i++){
           if (set.add(array[i]) == false){
               dup = i;
               break;
           }
        }
        if (dup!=-1){
            for (int i=dup  ; i<array.length-1 ; i++){
                array[i] = array[i+1];
            }
            array[array.length-1] = -1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {4,2,1,4,3,7};
        removeDupplicate2(array);
    }
}

class PrifixSum{
    static void prifixSum(int[] array,int fst , int last){
        int[] newArray = new int[array.length];
        newArray[0] = array[0];
        for (int i=1 ; i<array.length ; i++){
            newArray[i] = newArray[i-1]+array[i];
        }
        System.out.println(Arrays.toString(newArray));
        int result = newArray[last] - newArray[fst-1];
        System.out.println(result);

    }
    public static void main(String[] args) {
        int[] array = {4,1,5,6,2};
        prifixSum(array,2,3);
    }
}
class UniqueElement{
    static void unique(int[] array){
        int[] newArray = new int[20];
        for (int i=0 ; i< array.length; i++){
            newArray[array[i]]++;
        }
        for (int i=0; i< newArray.length; i++){
            if ((newArray[i]^1)==0){
                System.out.println(i);
                //break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,1,4,4,5};
        unique(array);
    }
}
class ValidParenthese{
    static boolean valid(String st){
        Stack<Character> stack = new Stack<>();
        for (int i=0  ; i<st.length() ; i++){
            if (st.charAt(i)=='(')
                stack.add(')');
            else if (st.charAt(i) == '{') {
                stack.add('}');
            } else if (st.charAt(i) == '[') {
                stack.add(']');
            } else if (stack.empty() || stack.pop() != st.charAt(i)) {
                return false;
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        System.out.println(valid("({])"));
    }
}