package com.firstjavaprogram.assignments;
import java.util.Scanner;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

public class Problem4 {
    public static void calculate(double num1, double num2, char operation ){
        if (operation == '+'){
            System.out.println("num1+num2 = " +(float) (num1+num2));
        }else if (operation == '-'){
            System.out.println("num1-num2 = " + (float)(num1-num2));
        }else if(operation=='*'){
            System.out.println("num1*num2 =" +  (float)(num1*num2));
        }else {
            System.out.println("num1/num2 = " + (float)(num1/num2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number");
        double num2 = sc.nextDouble();

        // Reading a character from user input
        System.out.println("Input a operation (+,-.*,/)");
        char operation = sc.next().charAt(0);

        calculate(num1, num2, operation);
    }
}
