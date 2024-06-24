package practise.Problems;

public class PrefixSum {

    static int[] prefixSum(int[] arr){
        int[] ps = new int[arr.length];

        ps[0] = 1 ;
        for(int i =1;  i<arr.length ; i++){
            ps[i] = ps[i-1]+arr[i-1];
        }
        return ps ;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        int [] res = prefixSum(arr);
        for(int a : res){
            System.out.print(a+" ");
        }
    }
}
