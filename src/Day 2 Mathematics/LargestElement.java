public class LargestElement {
    static int getGreatest(int arr[]){
        int greatest =0 ;
        for (int i =0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    greatest = arr[j];

                };
            };
        };
        return greatest ;
    };
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,100,7,8} ;
        System.out.println(getGreatest(arr));
    }
}
