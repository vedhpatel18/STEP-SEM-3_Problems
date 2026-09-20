/*
@author Vedh
*/
class Question2{
    int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];
            int profit = prices[i] - min;
            if (profit > maxProfit)
                maxProfit = profit;
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Question2 obj = new Question2();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(obj.maxProfit(prices));
    }
}