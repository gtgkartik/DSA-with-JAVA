package com.Arrays_and_ArrayLists;

import java.util.Arrays;
import java.util.Scanner ;
public class Inputtoarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int[] arr = new int[10];
        //added

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt() ;
        }

        for(int num : arr){
            System.out.println(num);
        }

        System.out.println(Arrays.toString(arr));
    }
}
