package com.Searching;

public class CeilOFNumberInArrayBinarySearch {
    static int binarySearch(int target, int [] arr){

        int start = 0 ;
        int end  = arr.length-1 ;

        while(start<=end){
            int middle = (start+end)/2;
            if(arr[middle] < target){
                start = middle +1 ;
            }else if(target<arr[middle]){
                end = middle-1 ;
            }else{
                return middle ;
            }
        }


        return arr[start-1] ;
    }

    public static void main(String[] args) {
        int[] arr = {6,8};
        System.out.println(binarySearch(10,arr));
    }
}
