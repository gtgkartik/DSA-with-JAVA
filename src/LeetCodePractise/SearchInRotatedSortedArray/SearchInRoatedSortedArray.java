package LeetCodePractise.SearchInRotatedSortedArray;

public class SearchInRoatedSortedArray {

    static int findPeak(int arr[]){
        int start = 0 ;
        int end = arr.length-1 ;

        while(start<end){
            int mid = start +  (end-start)/2 ;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start =  mid+1 ;
            }
        }

        return start ;
    }

    static int searchAscending(int start , int end, int arr[], int target){
        while(start<=end){
            int mid = start + (end - start)/2 ;
            if(arr[mid]<target){
                start = mid+1 ;
            }else if(target< arr[mid]){
                end = mid -1 ;
            }else{
                return mid ;
            }
        }
        return -1 ;
    }

//    static int searchDescending(int start , int end, int arr[], int target){
//        while(start<=end){
//            int mid = start + (end - start)/2 ;
//            if(arr[mid]<target){
//                end = mid -1 ;
//            }else if(target< arr[mid]){
//                start = mid+1 ;
//            }else{
//                return mid ;
//            }
//        }
//        return -1 ;
//    }
    public static void main(String[] args) {
//        int arr[] = {4,5,6,7,0,1,2}
        int arr[] = {5,1,3};
        int peak = findPeak(arr);
        System.out.println(peak);
        int target = 5 ;
        int res = searchAscending(0,peak,arr,target);
        if(res != -1){
            System.out.println(res);
        }else{
            System.out.println(searchAscending(peak+1, arr.length-1, arr, target));
        }

    }
}
