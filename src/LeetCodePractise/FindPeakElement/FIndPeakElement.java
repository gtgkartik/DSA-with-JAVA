package LeetCodePractise.FindPeakElement;

public class FIndPeakElement {

    static int findPeak(int [] arr) {
        int start = 0 ;
        int end = arr.length -1 ;
        while(start<end){
            int mid = start+ (end - start)/2;

            if(arr[mid] >  arr[mid+1]){
                end = mid ;
            }else{
                start = mid+1 ;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2,3,2};
        System.out.println(findPeak(arr));
    }
    }



