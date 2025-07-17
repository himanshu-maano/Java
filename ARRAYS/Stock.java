public class Stock {
    public static int buyAndsell_Stock (int price[]) { //time complexity -> O(n)
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<price.length; i++) {
            if(buyPrice < price[i]) { //profit
                int profit = price[i] - buyPrice;  //todays profit
                maxProfit = Math.max(profit, maxProfit);
            }else {
                buyPrice = price[i];
            }
        }

        return maxProfit;
    }
    public static void main (String[] agrs) {
        int price[] = {7, 6, 5, 1, 6, 8, 2, 6};
        System.out.println("Max Profit is " + buyAndsell_Stock(price));
    }
}
