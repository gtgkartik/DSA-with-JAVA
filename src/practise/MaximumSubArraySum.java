package practise;

public class MaximumSubArraySum {

    static int max = -999999999 ;
    static int maxsubarraysum(int arr[]){
         int sum = 0 ;
        for(int i = 0 ; i  < arr.length ; i ++){
            sum = 0 ;
            for(int j =i ; j<arr.length ; j ++){
                sum += arr[j];
                if(sum>max){
                    max = sum ;
                }
            }
        }
        return  max ;
    }


    public static void main(String[] args) {
        int arr [] = {-2,1};
        System.out.println( maxsubarraysum(arr));;

    }
}
