package com.conditionals_loops;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float res = 0 ;
        while(true){
            System.out.println("Enter operation (+,-,/,%,*)");
            char operation = sc.next().trim().charAt(0);

            if(operation == '+' || operation == '-' || operation == '*' || operation =='/' || operation == '%'){
                float num1 = sc.nextFloat();
                float num2 = sc.nextFloat();
                if(operation== '+'){
                    res = num1 + num2 ;
                    System.out.println(res);

                }
                if(operation== '-'){
                    res = num1 - num2 ;
                    System.out.println(res);

                }
                if(operation== '*'){
                    res = num1 * num2 ;
                    System.out.println(res);

                }
                if(operation== '/'){
                    if(num2 >0){
                        res = num1 / num2 ;
                        System.out.println(res);

                    }else{
                        System.out.println("Divisior cannot be zero");
                    }
                }
                if(operation== '%'){
                    res = num1 % num2 ;
                    System.out.println(res);

                }


            }else if (operation == 'x' || operation == 'X'){
                break ;
            }else{
                System.out.println("Enter proper operation");
            }
        }
    }
}
