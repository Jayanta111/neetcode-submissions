class Solution {
    public int maxProfit(int[] prices) {
        int maxP=0; //Maximum Profit
        int minBuy=prices[0]; //Day 1
   for(int sell:prices){
    maxP=Math.max(maxP,sell-minBuy); //Maximum Profit
    minBuy=Math.min(minBuy,sell);  //Minmum Pofit compared both minBuy and sell
   }
return maxP;
    }
}
