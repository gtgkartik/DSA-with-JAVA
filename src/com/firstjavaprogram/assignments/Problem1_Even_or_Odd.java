package com.firstjavaprogram.assignments;
import java.util.Scanner ;
// Write a program to print whether a number is even or odd, also take input from the user.

public class Problem1_Even_or_Odd {

     void EvenOrOdd(int n)
    {
        if (n%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int number  = input.nextInt();
        Problem1_Even_or_Odd eoo = new Problem1_Even_or_Odd();
        eoo.EvenOrOdd(number);

    }
}
