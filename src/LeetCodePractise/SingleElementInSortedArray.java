package LeetCodePractise;

public class SingleElementInSortedArray {

static    int singleNonDuplicate(int[] nums) {
int start  = 0 ;
int end = nums.length-1 ;
int res = 0 ;

while(start<=end){
    int middle = start + (end - start)/2 ;
    if(nums[middle+1] != nums[middle] && nums[middle-1] == nums[middle]){
        return nums[middle];
    }

   if((middle%2==0 && nums[middle] != nums[middle-1]) || middle%2==1 && nums[middle] != nums[middle+1] ){
       
   }
}

    return res ;

    }
    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));;
    }
}
