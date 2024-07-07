package recursion;
import java.util.Arrays;
public class ReverseAnArrayUsingRecursionPractise {

static void reverse(int [] arr,int i ){
    int  j =  arr.length - i- 1 ;
    System.out.println("i: " +  i);
    System.out.println("j: " + j);


    if(i>=j){
        return ;
    }
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp ;

    reverse(arr, i+1);
}
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9};
        reverse( arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
