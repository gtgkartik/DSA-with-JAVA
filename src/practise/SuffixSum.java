package practise;

public class SuffixSum {


    private static int[] suffixSum(int[] arr) {
        int ss[] = new int[arr.length ];
        ss[arr.length-1]  = 1 ;
        for(int i = arr.length-2; i >=0; i --){
            ss[i]= ss[i+1]+arr[i+1];
        }
        return ss ;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        int [] res = suffixSum(arr);
        for(int a : res){
            System.out.print(a+" ");
        }
    }


}
