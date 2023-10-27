import java.util.ArrayList;

public class Deletion {
    static int [] delete(int x, int arr []){

        int  i ;
        for ( i =0; i< arr.length-1 ; i++){
            if (arr[i] == x ){
                System.out.println(i);
                break ;
            }
        };

        for (int j =i; j <arr.length-1; j++){
            arr[j] = arr[j+1];

        }
        return arr ;
    };
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9};
        delete(5,arr);
        for (int i=0 ; i<arr.length ; i ++){
            System.out.print(arr[i]);
        }

    }
}
