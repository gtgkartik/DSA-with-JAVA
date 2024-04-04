package com.Arrays_and_ArrayLists;

import java.util.Arrays;

public class ArraysLearning {

    public static void main(String[] args) {
        int[] arr ;  // declaring in the stack memory
         arr = new int[10] ;    // intilaization in the heap memory

        arr[0] = 0 ;
        arr[1] = 1;

//        System.out.println(arr[0]);

        // Reference variables are always copied by reference when passed down to functions
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(fun(arr)));

    }
    static int[] fun(int[] nums){
        nums[2] = 2 ;
        return nums ;
    }
}
