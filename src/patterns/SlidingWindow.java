package patterns;

// find the lenght longest sub array whose sum is less than or equal to k
public class SlidingWindow {

    static int findlength(int arr[] , int  k ){
        int max_length = 0 ;

        int  l = 0 ;
        int r = 0 ;
        int sum = 0 ;
        while (r<arr.length){
            sum = sum+arr[r];

            while(sum>k){
                sum = sum - arr[l];
                l++ ;
            }

            if(sum<=k){
                max_length = Math.max(max_length, r-l+1);
                r++ ;
            }
        }
        System.out.println(max_length);
        return max_length;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        findlength(arr,10);
    }
}
