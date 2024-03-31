//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/
class Solution {
    public int [] Running_min(int [] arr){
        
        int n= arr.length;
        int [] ans= new int[n];
        
        ans[0]= arr[0];
        
        for(int i=1; i<n;i++){
            
            ans[i]= Math.min(ans[i-1], arr[i]);
        }
        
        return ans;
    }
    public int maxProfit(int[] prices) {
       
     
        int [] running_min=Running_min(prices);
       
        int overall_max=0;
        for(int sell=1; sell<prices.length;sell++){
            
            int aabhi_taak_ka_minimum=  running_min[sell-1];
            
            int curr_profit= prices[sell]-aabhi_taak_ka_minimum;
            overall_max= Math.max(overall_max,curr_profit );
        }
        
        return overall_max;
    }
}
