package com.Arrays_and_ArrayLists;
import java.util.Arrays;
import java.util.Scanner ;
public class MultiDimensionalArrays {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows  = sc.nextInt();
        int cols = sc.nextInt() ;

        int [][] arr = new int [rows][cols];

        for(int row = 0 ; row< rows; row++){
            for(int col = 0 ; col< cols ; col ++){
                arr[row][col] = sc.nextInt();
            }
        }

        for(int row = 0 ; row< arr.length ; row ++){
            for(int col = 0 ; col<arr[row].length ; col++){
                System.out.print(arr[row][col] + " ");
            }
        }
    }
}
