//package DynamicProgramming;
//
//class Solution {
//
//	  // return Maxmimum Amount I can rob from house started from ith index.
//	    public int helper(int [] arr, int i){
//
//	       if(i >= arr.length){
//	            return 0;
//	       }
//
//	      // chori Karenge
//
//	      int ans2 = arr[i]+ helper(arr, i+2);
//	      // Chori Nahi karenge
//	     int ans1= helper(arr, i+1);
//
//	     int mera_ans= Math.max(ans1, ans2);
//	     return mera_ans;
//
//	    }
//	    public int rob(int[] nums) {
//	        
//	       return  helper(nums, 0);
//	    }
//	}
//public class HouseRobbery {
//
//}
