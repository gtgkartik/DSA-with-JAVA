package recursion;

import java.util.* ;
public class GenerateSubsequences {

    static void generateSubsequences(int arr[] , int index, ArrayList<Integer> empty){

        if(index == arr.length){
            System.out.println(empty);
            return ;
        }

        ArrayList<Integer> withelement  = new ArrayList<>(empty);
        withelement.add(arr[index]);

        generateSubsequences(arr, index+1, withelement);
        generateSubsequences(arr, index+1,empty);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        generateSubsequences(arr,0,new ArrayList<>());
    }
}
