package com.Arrays_and_ArrayLists;

import java.util.ArrayList;
import java.util.Scanner ;
public class TwoDArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        // Initializing the inner Array List
        for (int i = 0; i < 3; i++) {
            arr.add(new ArrayList<>());
        }

        //
        for(int i = 0 ; i < 3 ; i ++){
            for (int j = 0; j <4; j++) {
                arr.get(i).add(sc.nextInt());
            }
        }

        System.out.println(arr);

    }
}
