package com.conditionals_loops;

import java.util.Scanner;

public class CaseCheck {

    public static void main(String[] args) {
        // 65 to 80   A to Z
        // 97 to 122  a to z

        Scanner sc = new Scanner(System.in);
        char letter = sc.nextLine().trim().charAt(0);
        int assicivalue = (int)(letter);

        if(assicivalue>=65 && assicivalue<=89){
            System.out.println("Upper case");
        }else if(assicivalue>=97 && assicivalue <=122){
            System.out.println("Lower case");
        }else {
            System.out.println("special characterS");
        }

    }
}
