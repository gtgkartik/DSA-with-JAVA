package practise.Problems;

public class SingleElementInASortedArray {


    public static void main(String[] args) {
        int arr [] = {1,1,2};

     int  i = 0 ;
     int j =1 ;
     while(j<=arr.length-1){
         if(arr[i]==arr[j]){
             i= i +2;
             j = j +2;
         }else{
             System.out.println(arr[i]);
             break;
         }
     }
    }
}
