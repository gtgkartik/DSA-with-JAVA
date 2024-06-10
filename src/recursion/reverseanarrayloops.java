package recursion;

public class reverseanarrayloops {


    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};

        int j = arr.length -1 ;

        for (int i=0 ; i <arr.length ; i ++){
            int temp = 0 ;
            if(i>j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j-- ;
        }

        for(int  n : arr){
            System.out.println(n);
        }
    }
}
