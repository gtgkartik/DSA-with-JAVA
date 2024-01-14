package com.conditionals_loops;
import java.util.Scanner ;
public class ReversetheNumber {

    static int reverse(int n){
        int temp = n;
        int rev = 0;
        while(temp >0){
            int ld = temp%10 ;
            rev= 10*rev + ld ;
            temp = temp/10 ;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(reverse(number));
    }
}
