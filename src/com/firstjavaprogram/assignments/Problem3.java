package com.firstjavaprogram.assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

/* formula
    SI= PTR/100
*/

public class Problem3 {
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

        Problem3 problem = new Problem3();
        problem.calculateSimpleIntrest(p,t,r);
    }
}
