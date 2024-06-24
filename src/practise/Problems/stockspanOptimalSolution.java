package practise.Problems;

public class stockspanOptimalSolution {
    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < arr.length; i++) {
            // Update the minimum price encountered so far
            if(arr[i] < minPrice) {
                minPrice = arr[i];
            }
            // Calculate the potential profit at the current price and update maxProfit if it's higher
            else if(arr[i] - minPrice > maxProfit) {
                maxProfit = arr[i] - minPrice;
            }
        }

        System.out.println(maxProfit);
    }
}
