package com.functions.assignments;
import java.util.Scanner ;

public class Problem6_Circle {
    static float pi = 3.14f ;
    static int area(float radius){
        int result =  (int) (pi*radius*radius) ;
        return result ;
    }
    static float circumference(float radius){
        float result = 2*pi*radius ;
        return result ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        float r = sc.nextFloat();
        System.out.println("Area:" + area(r));
        System.out.println("Circumference:" + circumference(r));
    }
}
