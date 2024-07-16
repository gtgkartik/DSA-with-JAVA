package LeetCodePractise.PeakIndexOfMountainArray;

import java.util.Arrays;
import java.util.HashMap;

// This is O(n*log(n) + n) solution bevause we are sorting and iterating througth the array once
// Brute force solution
public class PeakIndexOfMountainArraySolution1 {


    public static void main(String[] args) {
        class Solution {
            public int peakIndexInMountainArray(int[] arr) {
                HashMap<Integer, Integer> map = new HashMap<>();

                for(int i = 0 ; i < arr.length ; i++){
                    map.put(arr[i], i);
                }

                Arrays.sort(arr);
                int res= map.get(arr[arr.length-1]) ;
                return res ;
            }
        }
    }
}
