package com.firstjavaprogram.assignments;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

/* formula
    SI= PTR/100
*/

public class Problem3_Simple_Intrest {
    void calculateSimpleIntrest(double p, float t, float r){
        double result = (p*t*r)/100;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Principal Amount: ");
        double p = input.nextDouble();

        System.out.println("Enter time: ");
        float t = input.nextFloat();

        System.out.println("Enter rate: ");
        float r = input.nextFloat();

        Problem3_Simple_Intrest problem = new Problem3_Simple_Intrest();
        problem.calculateSimpleIntrest(p,t,r);
    }
}
