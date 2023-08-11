//referenced
class Solution {
    int dp[][]; 
    int coins[];
    public int change(int amount, int[] coins) { 
        this.coins=coins;
        int len = coins.length;
        dp= new int[len+1][amount+1];
        for(var v:dp) Arrays.fill(v,-1);
        return  rec(0,amount);
    }
    int rec(int i,int amount){
        if(amount==0) return 1;
        if(i>=coins.length) return 0;
        if(dp[i][amount]!=-1) return  dp[i][amount];
        int take=0;
        if(coins[i]<=amount)take=rec(i,amount-coins[i])+rec(i+1,amount);
        int skip=rec(i+1,amount);
        return  dp[i][amount]=Math.max(take,skip);
    }
}