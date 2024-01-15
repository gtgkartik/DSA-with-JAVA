package com.functions;

import java.util.Arrays;

public class ChangeValue {
    static String changevalue(int[] num){
        num[0] = 99 ;
        return Arrays.toString(num);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("num: " + changevalue(arr));
        System.out.println("arr: " + Arrays.toString(arr));

    }
}
