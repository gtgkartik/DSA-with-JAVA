package com.Searching;

public class SearchInStrings {


    public static void main(String[] args) {
        String name = "kartik";
        System.out.println(name.length());
        System.out.println(name.charAt(0));

        // searching for a chanracter inside a string
        char target = 'i' ;
        for(int i =0 ; i < name.length() ; i ++){
            if(target==name.charAt(i)){
                System.out.println(name.charAt(i));
            }
        }
    }
}
