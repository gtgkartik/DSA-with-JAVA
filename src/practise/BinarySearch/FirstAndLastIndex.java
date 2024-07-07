package practise.BinarySearch;


import java.util.Scanner;

class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}

public class FirstAndLastIndex {
static int search(int arr[],int  k, boolean leftsearch ){
    int start =  0 ;
    int end = arr.length-1;
    int res = 0 ;
    while(start<=end){
        int mid =  start + (end-start)/2;
        if(arr[mid]<k){
            start = mid+1 ;
        }else if(arr[mid] > k){
            end = mid - 1;
        }else{
            res = mid ;
            if(leftsearch){
                end = mid-1 ;
            }else{
                start = mid + 1 ;
            }
        }
    }

    return   res ;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

       int leftIndex =  search(arr, k, true);
        System.out.println(leftIndex);
        int rightIndex =  search(arr, k, false);
        System.out.println(rightIndex);


    }
}
