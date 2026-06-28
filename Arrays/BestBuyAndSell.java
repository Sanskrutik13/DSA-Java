public class BestBuyAndSell {

    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};
        int n = arr.length;

        int buy = arr[0];
        int profit = 0;

        for (int i = 0; i < n; i++) {

            // Update minimum buying price
            buy = Math.min(buy, arr[i]);

            // Calculate maximum profit
            if (arr[i] > buy) {
                profit = Math.max(profit, arr[i] - buy);
            }
        }

        System.out.println("Maximum Profit = " + profit);
    }
}