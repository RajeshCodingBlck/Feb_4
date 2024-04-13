package Array_question;

public class Maximum_kadens {
	class Solution {
	    public int maxSubArray(int[] nums) {
	        
	      int overall_max_sum= Integer.MIN_VALUE; 
	      int currsum=0;
	        
	      for(int i=0; i<nums.length;i++){
	          
	          currsum+=nums[i];
	          overall_max_sum= Math.max(currsum, overall_max_sum);
	          
	          if(currsum<0){
	              currsum=0;
	          }
	      }
	      
	        return overall_max_sum;
	       
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
