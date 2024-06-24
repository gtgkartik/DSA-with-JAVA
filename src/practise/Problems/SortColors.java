package practise.Problems;

public class SortColors {

    static void swap(int arr[] , int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp ;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,-1};
        for(int  i  = 0 ; i < arr.length ; i ++){
            for(int j = 0 ; j < arr.length ; j ++){
                if(arr[i]<arr[j]){
                    swap(arr,i,j);
                }
            }
        }

        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
