package com.functions;

import java.util.Scanner;

public class Swap {
    static String swap(int num1, int num2){
        int temp = num1  ;
        num1 = num2 ;
        num2 = temp ;
        String result = "num1:" + num1 + " num2:" + num2 ;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(swap(num1,num2));
        //pass by value not pass by reference ;
        System.out.println(num1 +" " +num2);

    }
}
