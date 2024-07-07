package practise.BinarySearch;

public class SmallestLetterInAArrayGreaterThanTarget {

    static char search(char arr[] , int target){
        if(target<arr[0]){
            return arr[0];
        }

        int start = 0 ;
         int end  =  arr.length -1 ;
         while(start<=end){
             int mid = start  + (end-start)/2 ;
             if(arr[mid]<target){
                start  =  mid+1 ;
             }else if(arr[mid]>target){
                end = mid-1 ;
             }else{
                 return arr[start];
             }
         }

        return arr[start];
    }
    public static void main(String[] args) {
        char [] arr = {'c','f','j'};
        char target =  'c' ;
        System.out.println(search(arr, target));
    }
}
