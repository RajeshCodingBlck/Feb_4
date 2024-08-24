//package DynamicProgramming;
//
//class Solution {
//    public int maxSubArray(int[] nums) {
//      
//      int n=nums.length;
//      int ans=nums[0];
//      int [] dp= new int[n];
//
//      dp[0]=nums[0];
//
//      for(int i=1; i<n;i++){
//        dp[i]= Math.max(nums[i]+ dp[i-1], nums[i]);
//        ans=  Math.max(dp[i], ans);
//      }  
//
//      return ans;
//    }
//}
//public class maximumSubarraySum {
//
//}
