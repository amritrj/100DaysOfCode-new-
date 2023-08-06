class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
     int minimum=prices[0];
     int profit=0;
     int differenceProfit=0;
     for(int i=1;i<n;i++){
        differenceProfit=prices[i]-minimum;
        profit=Math.max(differenceProfit,profit);
        minimum=Math.min(prices[i],minimum);
     }
      return profit; 
    }
}