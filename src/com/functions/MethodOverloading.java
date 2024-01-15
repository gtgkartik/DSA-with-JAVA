package com.functions;

import java.util.Arrays;

public class MethodOverloading {
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(){
        System.out.println("function with no parameters");
    }

    public static void main(String[] args) {
        fun(1,2,3,43,4,5);
        fun("kartik");
        fun();
    }
}
