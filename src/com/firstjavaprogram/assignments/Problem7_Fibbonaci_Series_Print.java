package com.firstjavaprogram.assignments;

import java.util.Scanner;

public class Problem7_Fibbonaci_Series_Print {
    static void fibbonachi(int n){
        int firstterm = 0 ;
        int secondterm = 1 ;

        for(int i=1; i <=n ; i++){
            int nextterm = firstterm + secondterm ;
            System.out.println(firstterm);
            secondterm = firstterm;
            firstterm= nextterm ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        fibbonachi(n);

    }
}
