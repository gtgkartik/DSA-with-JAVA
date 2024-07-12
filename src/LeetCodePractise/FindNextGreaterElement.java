package LeetCodePractise;

import java.util.Arrays;

public class FindNextGreaterElement {


    public static void main(String[] args) {
        int nums1 [] = {4,1,2};
        int nums2 [] = {1,3,4,2};
        int arr[] = new int[nums1.length];

        for(int i = 0 ; i < nums1.length ; i++){
            int target = nums1[i];
            boolean elementfound = false ;
            for(int j = 0 ; j < nums2.length ; j++){
                if(nums2[j] == target ){
                    for(int k = j ; k< nums2.length; k++){
                        if(nums2[k]>target){
                            arr[i] = nums2[k];
                            elementfound = true ;
                            break;
                        }
                    }
                    break ;
                }
            }
            if(!elementfound){
                arr[i] = -1 ;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
