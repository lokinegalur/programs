class StockMaxProfit {
    public int maxProfit(int[] prices) {
        int mp=Integer.MIN_VALUE,day=0,mc=prices[day],n=prices.length;
        for(day=1;day<n;day++){
            if(prices[day]>mc)
                mp=Math.max(mp,prices[day]-mc);
            else
                mc=prices[day];
        }
        if(mp==Integer.MIN_VALUE)
            return 0;
        return mp;
    }
}
