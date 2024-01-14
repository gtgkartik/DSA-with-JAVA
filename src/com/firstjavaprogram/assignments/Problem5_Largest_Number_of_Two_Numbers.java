package com.firstjavaprogram.assignments;
import java.util.Scanner ;

// Take 2 numbers as input and print the largest number.
public class Problem5_Largest_Number_of_Two_Numbers {

    public static void largestNumber(double num1, double num2){
        if(num1 > num2){
            System.out.println(num1);
        }else {
            System.out.println(num2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = input.nextDouble();
        System.out.println("Enter second number");
        double num2 = input.nextDouble();

        largestNumber(num1, num2);

    }
}
