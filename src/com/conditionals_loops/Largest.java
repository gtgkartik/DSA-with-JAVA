package com.conditionals_loops;

import java.util.Scanner;

public class Largest {
    static float getMaxof3(float num1, float num2, float num3){
//        float max = num1 ;
//        if (num2>max){
//            max = num2;
//        }if(num3>max){
//            max = num3;
//        }

        float max = Math.max(num3, Math.max(num1,num2));
        return max ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();

        System.out.println(getMaxof3(num1, num2, num3));
    }
}
