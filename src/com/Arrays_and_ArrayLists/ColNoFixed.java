package com.Arrays_and_ArrayLists;

public class ColNoFixed {


    public static void main(String[] args) {
        int [][] arr =  {
                {1,2,3},
                {4,5,6},
                {7,8},
                {9,10}
        };

        for(int i=0; i<arr.length ; i ++){
            for(int j=0; j<arr[i].length ; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
