package com.conditionals_loops;

import java.util.Scanner;

public class CountingOccurences {
    static int count(int n, int x){
        int count = 0 ;
        int temp = n;
        while(temp !=0){
            int ld = temp%10 ;

            if(ld == x){
                count++ ;
            }
            temp = temp/10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(count(num, x));



    }
}
