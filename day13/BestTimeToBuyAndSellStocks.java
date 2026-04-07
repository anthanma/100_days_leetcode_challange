class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int mprofit=0;
        for(int i = 0 ; i< prices.length ; i++){
            if(min>prices[i]){
                min=prices[i];
            }
            if(prices[i]-min>mprofit){
                mprofit=prices[i] - min;
            }

        }
        return mprofit;
        
    }
}
/*BRUTE FORCE SOLUTION
class Solution {
    public int maxProfit(int[] prices) {
        //three thing we have to do in this question 
        //first find the minimum number 
        //second find the maximum number coming after the minimum number we just found in the array
        //third store and update the maximum profit

        int m_profit=0;
            for(int i=0;i<prices.length ; i++){
                for(int j=i+1; j<prices.length ;j++){
                    int profit=0;
                    if(prices[i]<prices[j]){
                        profit=prices[j]-prices[i];
                    }
                    if(profit>m_profit){
                        m_profit=profit;
                    }
                }
            }
        return m_profit;
    }
} */
