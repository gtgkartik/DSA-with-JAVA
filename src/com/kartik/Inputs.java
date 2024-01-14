package com.kartik;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
//        Scanner input = new  Scanner(System.in);
//        System.out.println("Enter your roll number: ");
//        int rollNum = input.nextInt();
//        System.out.println(rollNum);

        Sum calc1 = new Sum();
        int result = calc1.findsum();
        System.out.println(result);
    }
}

class Sum {
    int num3 = this.num3 ;
    int num4 = this.num4;
    int result = num3 * num4;
    Scanner input = new Scanner(System.in);

    int findsum(){

        int num1 = input.nextInt();
        int num2  = input.nextInt();
        return num1+ num2 ;
    }
}
