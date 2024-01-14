package com.firstjavaprogram.assignments;

import java.util.Scanner;

public class Problem9_ArmStrong_Number {
    static int count(int n){
        int temp = n ;
        int count = 0 ;
        while(temp !=0){
            count++;
            temp = temp/10 ;
        }
        return count ;
    };

    static int powerofNum(int num, int power){
        int result = 1;
        for(int i=1; i<=power; i++){
            result = result*num;
        }
        return result ;
    }

    public static boolean isArmstrong(int n){
        int power = count(n);
        int temp = n ;
        int result = 0 ;
        while(temp != 0 ){
            int ld = temp%10;
            result = result + powerofNum(ld,power);
            temp = temp/10;
        }
        if(result == n){
            return true ;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isArmstrong(num));
    }
}
