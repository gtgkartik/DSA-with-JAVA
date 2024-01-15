package com.functions;

import java.util.Arrays;

public class VarArgs {
    static void fun(int a, int b , int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void sum(int ...v){
        int sum = 0 ;
        for(int i=0; i<v.length; i++){
            sum = sum + v[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        fun(2,3,4,5,6,7,6,5,4);
        sum(1,2,3,4,5,45,4,3,3,3,3,3);
    }
}
