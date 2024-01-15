package com.conditionals_loops;

import java.util.Scanner;

public class Switch_Satatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//            String name =  sc.next();
//            switch (name){
//                case "kartik" :
//                    System.out.println("Hero only");
//                    break ;
//                case "praveen" :
//                    System.out.println("Good cgpa guy");
//                    break ;
//                case "sai" :
//                    System.out.println("Techy nerd guy");
//                    break ;
//                case "parth" :
//                    System.out.println("upcoming director");
//                    break ;
//                case "bhavesh" :
//                    System.out.println("talanted but lazy");
//                    break ;
//                default:
//                    System.out.println("Please enter a valid name");
//            }
//
//            if(name.equals("X") || name.equals("x")){
//                break ;
//            }

        int day = sc.nextInt();
//        switch(day){
//            case 1:
//                System.out.println("sunday");
//            case 2:
//                System.out.println("monday");
//            case 3:
//                System.out.println("tuesday");
//            case 4:
//                System.out.println("wednesday");
//            case 5:
//                System.out.println("thursday");
//            case 6:
//                System.out.println("friday");
//            case 7:
//                System.out.println("saturday");
//            default:
//                System.out.println("enter a num between1 to 7");
//        }

        //new syntax folr switch conditions

//        switch (day){
//            case 1 -> System.out.println("sunday");
//            case 2 -> System.out.println("monday");
//            case 3 -> System.out.println("tuesday");
//            case 4 -> System.out.println("wednesday");
//            case 5 -> System.out.println("thursday");
//            case 6 -> System.out.println("friday");
//            case 7 -> System.out.println("saturday");
//        }

//        switch (day){
//            case 1 :
//            case 2 :
//            case 3 :
//            case 4 :
//            case 5 :
//                System.out.println("weekdays");
//                break ;
//            case 6:
//            case 7:
//                System.out.println("weekends");
//                break;
//            default:
//                System.out.println("enter a number between 1 to 7");
//
//        }

//        switch (day) {
//            case 1,2,3,4,5 -> System.out.println("Weekdays");
//            case 6,7 -> System.out.println("weekends");
//            default -> System.out.println("enter a number between 1 to 7 ");
//        }

        int month = sc.nextInt();

        switch (month){
        case 1 -> {
            System.out.println("january");
            System.out.println("first month in a year");
        }
        case 2,3,4,5,6,7,8,9,10,11,12 -> {
            System.out.println("from 2 to 12 are other months of the year");
        }
            default -> {
                System.out.println("enter a proper month between 1 to 12");
            }
        }

    }
}
