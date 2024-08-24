//package DynamicProgramming;
//
//class Solution {
//
//	  // return Maxmimum Amount I can rob from house started from ith index.
//	    public int helper(int [] arr, int i, int [] dp){
//
//	       if(i >= arr.length){
//	            return 0;
//	       }
//
//	       if(dp[i] !=-1){
//	        return dp[i];
//	       }
//	      // chori Karenge
//	      int ans2 = arr[i]+ helper(arr, i+2, dp);
//	      // Chori Nahi karenge
//	     int ans1= helper(arr, i+1, dp);
//	     int mera_ans= Math.max(ans1, ans2);
//	     return  dp[i]=mera_ans;
//
//	    }
//	    public int rob(int[] nums) {
//	        
//	      int n=nums.length;
//	      int [] dp= new int[n];
//	    //   for(int i=0;i<n;i++){
//	    //     dp[i]=-1;
//	    //   }
//	       Arrays.fill(dp, -1);
//	       return  helper(nums, 0, dp);
//	    }
//	}
//public class HouseRobbery_recursionMemoization {
//
//}
