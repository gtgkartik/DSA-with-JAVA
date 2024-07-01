package com.Searching;
import java .util.Arrays ;
public class BinarySearch {

    static int binarySearch2(int target , int [] arr){
       int start  =  0 ;
       int end = arr.length -1 ;
       while(start<=end){
           int middle = (start+end)/2 ;
           if(arr[middle] == target){
              return middle ;
           }else if (arr[middle] < target){
               start = middle+1 ;
           }else {
               end = middle -1 ;

           }
       }
       return -1 ;
    }

    public static void main(String[] args) {
        int arr [] = {0,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch2(1, arr));

    }
}
