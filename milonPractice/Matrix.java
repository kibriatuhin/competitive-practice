package milonPractice;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        for (int i=0 ;i <3 ; i++){
            for (int j=0 ; j< 3 ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum = 0,count =2;//2 1 0


        for (int i=0 ;i <3 ; i++){
          for (int j=0 ; j< 3  ; j++){
              if (j==count){
                  System.out.println(matrix[i][count]);
                  sum +=matrix[i][count--];
              }
          }
        }
        System.out.println(sum);
    }
}

