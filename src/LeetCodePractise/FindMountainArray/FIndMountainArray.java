package LeetCodePractise.FindMountainArray;

public class FIndMountainArray {

    static int searchAscending(int [] arr , int target){
        int end = findPeak(arr);
        int start = 0 ;

        while(start<=end){
            int mid = start + (end-start)/2 ;
            if(target<arr[mid]){
                end = mid-1 ;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                return mid ;
            }
        }
        return -1 ;
    }

    static int searchDescending(int [] arr , int target){
        int start = findPeak(arr);
        int end  = arr.length-1 ;

        while(start<=end){
            int mid = start + (end-start)/2 ;
            if(target<arr[mid]){
                start = mid+1;
            }else if(arr[mid]<target){
                end = mid-1 ;

            }else{
                return mid ;
            }
        }
        return -1 ;
    }

    static int findPeak(int arr[] ){
        int start =  0 ;
        int end = arr.length-1 ;

        while(start<end){
            int mid = start + (end-start)/2 ;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start ;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,2,4,5,3,1};
        int target = 3 ;
       int left = searchAscending(arr,target);
       if(left!=-1){
           System.out.println(left);
       }else{
           System.out.println( searchDescending(arr,target));
       }

    }
}
