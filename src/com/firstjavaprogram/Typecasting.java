package com.firstjavaprogram;

public class Typecasting {
    public static void main(String[] args) {
//        byte age = 127 ;
//        int ageUpdate = age ;
//
//        int age2 = 128 ;
//        byte age2pdate = (byte)(age2);
//        System.out.println(age2pdate);
//
//        int age3 = 120 ;
//        byte age3update = (byte) (age3);
//        System.out.println(age3);

        // Finding Discriminant
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("b: ");
//        int b = input.nextInt();
//        System.out.println("a: ");
//        int a = input.nextInt();
//        System.out.println("c: ");
//        int c  = input.nextInt();
//
//        float result =  (b*b - 4*a*c)/2*a ;
//        System.out.println(result);

//        // Automatic type promotion
//        byte b = 50 ;
//        b = b*2;

        int number = 'A' ;
        number = (char)(number);
        System.out.println(number);

        // Unicode in java
        System.out.println("사랑해요");
        String 사랑해요 = "I love you";
        System.out.println(사랑해요);

    }
}
