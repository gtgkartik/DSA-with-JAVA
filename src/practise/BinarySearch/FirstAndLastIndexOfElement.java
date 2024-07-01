package practise.BinarySearch;

public class FirstAndLastIndexOfElement {


    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3,3,3,4,5};
        int target = 3 ;
        int firstindex = 0 ;
        int lastindex = 0 ;
        for(int i = 0 ; i <arr.length ; i ++){
            if(arr[i]==target){
                firstindex = i ;
                int index = i ;
                while(arr[index]==target){
                    lastindex = index ;
                    index++ ;
                }
                break ;
            }
        }

        System.out.println(firstindex);
        System.out.println(lastindex);
    }
}
