package com.firstjavaprogram.assignments;

import java.util.Scanner;

public class Problem10_Fibonacci_number_get_nth_element {

    static void fibonacci(int n ){
        int a = 0 ;
        int b = 1 ;
        int c = 0 ;
        for(int i=1; i<n ; i++){
            int temp = b ;
            c = a+b ;
            b = c;
            a = temp ;
            temp = b;
        };
        System.out.println(c);
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }
}