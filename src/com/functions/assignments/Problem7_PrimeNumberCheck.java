package com.functions.assignments;

import java.util.Scanner;

public class Problem7_PrimeNumberCheck {
    static boolean isPrime(int num){

        if(num==2 || num==3 ||num== 5|| num == 7 || num== 1){
            return true;
        }

        if(num%2==0 || num%3==0 || num%5==0){
            return false ;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         while(true){
             int num = sc.nextInt();
             if(num==0){
                 break;
             }
             System.out.println(isPrime(num));;
         }
    }
}
