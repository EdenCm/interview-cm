public class jianzhi63_MaxProfit {

    class  Solution{


        public  int maxProfit(int [] prices){
            if(prices == null || prices.length < 2) return  0;

            int min = prices[0];
            int maxProfit = 0;
            for (int i = 0 ; i < prices.length ; i++){
                if (prices[i] < min) min = prices[i];
                int profit = prices[i] - min;
                maxProfit = Math.max(profit,maxProfit);
            }
            return maxProfit;
        }
    }
}
