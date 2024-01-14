package com.firstjavaprogram.assignments;
import java.util.Scanner ;

// Take name as input and print a greeting message for that particular name.
public class Problem2 {

        void Greetings(String name){
            System.out.println("Hello " +  name);
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name  = input.next();
        Problem2 problem = new Problem2();
        problem.Greetings(name);
    }
}
