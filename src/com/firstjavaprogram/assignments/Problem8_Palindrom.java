package com.firstjavaprogram.assignments;

import java.util.Scanner;

// To find out whether the given String is Palindrome or not.
public class Problem8_Palindrom {
    static boolean palindrome(String n){
        int i = 0 ;
        int j = n.length() -1 ;

        while(i<j){
            if(n.charAt(i) != n.charAt(j)){
                return false ;
            }
            i++ ;
            j--;
        }

        return true ;

    }
    public static void main(String[] args) {
        Scanner input   = new Scanner(System.in);

//        String word = input.next();
//        System.out.println(palindrome(word));

        int num = input.nextInt();
        Problem8b problem = new Problem8b();
        System.out.println(problem.palindrome(num));
    }
}

class Problem8b {

    public boolean palindrome(int n){
        int rev = 0 ;
        int temp = n ;
        while(temp !=0){
            int ld = temp%10 ;
            rev = rev*10 + ld ;
            temp = temp/10 ;
        }
        if(n == rev){
            System.out.println(rev);

            return true ;
        }
        return false ;
    }
}
