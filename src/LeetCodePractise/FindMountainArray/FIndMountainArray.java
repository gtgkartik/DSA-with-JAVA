package LeetCodePractise.FindMountainArray;

public class FIndMountainArray {

    static int searchAscending(int start, int end , int [] arr , int target){

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
        int start = findPivot(arr);
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

//    static int findPeak(int arr[] ){
//        int start =  0 ;
//        int end = arr.length-1 ;
//
//        while(start<end){
//            int mid = start + (end-start)/2 ;
//            if(arr[mid]>arr[mid+1]){
//                end = mid;
//            }else{
//                start = mid+1;
//            }
//        }
//        return start ;
//    }

    static int findPivot(int arr []){
        int start = 0 ;
        int end = arr.length -1  ;

        while(start<=end){
            int mid = start+ (end - start)/2 ;
            if(mid<end && arr[mid] >  arr[mid+1]){
                return mid ;
            }

            if( mid > start && arr[mid]<arr[mid-1]){
                return mid ;
            }

            if(arr[mid]<=arr[start]){
                end = mid-1 ;
            }else{
                start = mid +1 ;
            }
        }

        return -1 ;
    }


    public static void main(String[] args) {
        int arr[] = {5,1,3};
        int target = 1 ;

        int pivot = findPivot(arr);
        System.out.println(pivot);
        int left = searchAscending(0 , pivot ,arr, target);
        if(left == -1){
            System.out.println(searchAscending(pivot+1, arr.length-1, arr, target));
        }

    }
}
