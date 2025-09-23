package Ch1_Array_2d_arrList;

public class Q12_BuyAndSell {
    public static int buyAndSell(int prices[])
    {
        int profit = 0;
        int maxProfit = 0;
        int buyPrice = prices[0];

        for(int i=1; i<prices.length; i++)
        {
            if(prices[i] < buyPrice)
            {
                buyPrice = prices[i];
            }
            else
            {
                profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int ans = buyAndSell(prices);
        System.out.println(ans);
    }
}
