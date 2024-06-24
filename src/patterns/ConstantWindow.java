package patterns;

// Given a array, find k consecutive integers whose sum is maximum in a array
public class ConstantWindow {

    static int findKIntegersSumMax(int arr[] , int k ){
       int maximum_of_four_integers = 0 ;
        int  l = 0 ;
        int r = k-1 ;
        for(int i = 0 ; i < k ; i ++){
            maximum_of_four_integers += arr[i];
        }

int result = maximum_of_four_integers ;
        while(r<arr.length-1){
            r++;
            maximum_of_four_integers -= arr[l];
            l++ ;
            maximum_of_four_integers += arr[r];
            if(maximum_of_four_integers>result){
                result = maximum_of_four_integers;
            }
            System.out.println(r);
        }

        System.out.println(result);

        return 0 ;
    };
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,11,10};
        findKIntegersSumMax(arr,4);


    }
}
