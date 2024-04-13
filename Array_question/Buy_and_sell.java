package Array_question;

public class Buy_and_sell {
    
//	https://leetcode.com/submissions/detail/1219015796/
	class Solution {
	    public int maxProfit(int[] prices) {
	        
	  int max_profit=0;   
	for(int buy=0; buy<prices.length;buy++){
	         
	    for(int sell=buy+1; sell<prices.length;sell++)
	    {
	      
	    
	     int curr_profit= prices[sell]-prices[buy];
	      // System.out.println("Buy at "+ buy + " sell at "+ sell+ " profit is"+ curr_profit); 
	        
	        max_profit= Math.max(curr_profit, max_profit);
	        
	        
	    }
	    }
	        
	        return max_profit;
	        
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
