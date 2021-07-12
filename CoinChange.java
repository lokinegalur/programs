class CoinChange {
        static int[] dp;
    
        static int excBottomUp(int amount,int[] coins){
        for(int amt=1;amt<=amount;amt++){
            int ans=dp.length;
            for(int coin:coins){
                if(coin<=amt)
                    ans=Math.min(ans,dp[amt-coin]+1);
                }
            dp[amt]=ans;
            }
            return dp[amount];
     }
     
     static int excTopDown(int amt,int[] coins){
        if(dp[amt]!=0)
            return dp[amt];
        if(amt==0){
            dp[amt]=0;
            return 0;
        }
        int min=dp.length;
        for(int coin:coins){
            if(amt-coin>=0)
                min=Math.min(min,exc(amt-coin,coins)+1);
        }
        dp[amt]=min;
        return dp[amt];
    }
    
    
    
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        dp=new int[amount+1];
        int ans=exc(amount,coins);
        if(ans==(amount+1))
            return -1;
        return ans;
    }
}
