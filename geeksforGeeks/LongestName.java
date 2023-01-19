package geeksforGeeks;

public class LongestName {
   static String longest(String names[], int n) {
       int max = names[0].length(),index = -1;


       for (int i=1 ; i<n ; i++){
           if (max < names[i].length()){
               max = names[i].length();
               index = i;
           }
       }
       return names[index];
    }
    public static void main(String[] args) {
       String[] array = {"Geek", "Geeks", "Geeksfor",
               "GeeksforGeek", "GeeksforGeeks"};
        System.out.println(longest(array,array.length));
    }
}
