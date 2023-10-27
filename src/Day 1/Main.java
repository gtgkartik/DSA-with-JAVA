import java.util.ArrayList;

public class Main {
    static void search(int[] arr, int x){
        for (int i=0; i<arr.length; i++){
            if(arr[i] ==x) {
                System.out.println(arr[i]);
            }
        }
    }
    static void insert(int arr[], int x , int position){
        int index = position -1 ;
        for(int i = arr.length-2 ; i>=index ; i --){
            arr[i+1] = arr[i];
        }
        arr[index] = x ;

        for (int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] + ",");
        }

    }


    public static void main(String args[]){
//        ArrayList<Integer> arr = new ArrayList<>(5);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);

        int arr [] = new int[5] ;
        arr[0] = 1 ;
        arr[1] = 2 ;
        insert(arr, 15, 1);

        //search(arr,3);
    };
}

