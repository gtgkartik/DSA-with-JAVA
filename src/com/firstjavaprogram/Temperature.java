package com.firstjavaprogram;

import java.util.Scanner;

/*  fahrenheit to celsius convertor
    formula
    °C = (32)+  C*(9/5)
*/

public class Temperature {
    static float tempF(float C){
       float tempf = C*((float) 9/5) + 32 ;
       return tempf ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature in Celsius: ");
        float tempC = sc.nextFloat();

        System.out.println(tempF(tempC));
    }
}
