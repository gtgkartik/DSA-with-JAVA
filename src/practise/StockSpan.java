package practise;

public class StockSpan {


    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};

        int maxProfit =0 , profit =0;
        for(int i = 0 ; i < arr.length ; i ++){
            for(int j = i ; j < arr.length ;j++){
                if(arr[i] <arr[j]){
                    profit = arr[j] - arr[i];
                    if(profit > maxProfit) {
                        maxProfit = profit;
                    }
                }
            }
        }

        System.out.println(maxProfit);
    }
}
