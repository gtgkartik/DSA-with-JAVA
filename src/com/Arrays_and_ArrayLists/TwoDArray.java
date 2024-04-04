package com.Arrays_and_ArrayLists;

import java.util.Arrays ;
import java.util.Scanner ;
public class TwoDArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][2]; // mentioning the number of rows is important but not columns


        // taking input for 2d array
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int[] nums : arr){
            System.out.println(Arrays.toString(nums));
        }


    }
}
