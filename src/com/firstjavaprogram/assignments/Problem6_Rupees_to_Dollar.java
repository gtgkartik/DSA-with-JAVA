package com.firstjavaprogram.assignments;

import java.util.Scanner;

public class Problem6_Rupees_to_Dollar {

    public static float inDollar(float inrupees){
        float indollar =  inrupees/83 ;

        return indollar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Money in Rupees: ");
        float rupees = sc.nextFloat();
        System.out.println(inDollar(rupees));
    }
}
