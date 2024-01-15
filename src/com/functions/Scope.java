package com.functions;

public class Scope {

    public static void main(String[] args) {
        {
            int num1 = 100 ;

            {
                int num2 = 200;
                num1 = 300;
            }
//            num2 = num1    this is not possible !!variable initialized within a scope cannot be used outside the scope

            {
//                int num1 = 10000 ;  this is not possible, variable initlaized outside the scope cannot be re inilaized inside the scope

            }

            {
                int num3 = 2000;
            }
            int num3 = 2234 ;  // this is possible as variable initlized within in a scope can be reinitlisized outeside the scope


        }
    }
}
