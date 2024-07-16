package LeetCodePractise.PeakIndexOfMountainArray;

public class PeakIndexOfMountainArraySolution2 {


    public static void main(String[] args) {

        int arr [] = {3,4,5,1};
        int start = 0 ;
        int end = arr.length -1 ;
        while(true){
            int mid = start+ (end - start)/2;
            if(arr[mid] >  arr[mid+1] && arr[mid] > arr[mid-1] ){
                System.out.println(arr[mid]);
                break ;
            }else if(arr[mid]< arr[mid+1]){
                start = mid +1 ;
            }else{
                end = mid-1;
            }
        }
    }
}
