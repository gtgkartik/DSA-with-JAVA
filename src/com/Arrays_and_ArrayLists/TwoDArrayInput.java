package com.Arrays_and_ArrayLists;

import java.util.Arrays;
import java.util.Scanner ;
public class TwoDArrayInput {


    public static void main(String[] args){
        int[][] arr = new int[2][3];

        Scanner sc = new Scanner(System.in);
        System.out.println(arr.length);

        for(int i=0; i<arr.length ; i ++){
            for(int j= 0; j< arr[i].length ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int[] num : arr){
            System.out.println(Arrays.toString(num));
        }
    }
}
