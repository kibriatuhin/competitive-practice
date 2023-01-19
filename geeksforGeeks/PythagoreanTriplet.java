package geeksforGeeks;

public class PythagoreanTriplet {
  static   boolean checkTriplet(int[] arr, int n) {
        // code here
        for (int i=0 ; i<arr.length-2 ; i++){
            for (int j= i+1 ; j< arr.length-1 ; j++){
                for (int k=j+1 ; k<arr.length ; k++){
                    int result = (arr[i] * arr[i]) + (arr[j]*arr[j]);
                    if (result == (arr[k] * arr[k])){
                        return true;
                    }
                }
            }
        }
        return  false;
    }
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 6, 5};
        System.out.println(checkTriplet(array,array.length));
    }
}
