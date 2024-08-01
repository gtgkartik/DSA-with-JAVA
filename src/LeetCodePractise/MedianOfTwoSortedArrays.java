package LeetCodePractise;

public class MedianOfTwoSortedArrays {

    static int medianOfSortedArrays(int nums1 [] , int nums2 [] ){
        int l1 =  0 ;
        int l2 = 0 ;
        int mid = (nums1.length+nums2.length)/2 ;
        int count = 0 ;
        int m1 = 0;
        int m2 = 0 ;

     while(count<=mid){
        
     }

        if(mid%2 != 0 ){
            if(nums1[l1]>nums2[l2]){
                return nums2[l2];
            }else{
                return nums1[l1];
            }
        }else{
            return (nums1[l1] +  nums2[l2])/2 ;
        }


    }

    public static void main(String[] args) {
        int [] nums1  = {1};
        int [] nums2  = {2,4};

        System.out.println(medianOfSortedArrays(nums1 , nums2));
    }
}
