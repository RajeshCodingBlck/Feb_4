//package DynamicProgramming;
//
//class Solution {
//    public int climbStairs(int n) {
//        
//    // dp[i] => no of ways to reach 0th Stair from ith Stair. 
//        int [] dp= new int[n+1];
//        dp[0]=1;
//        dp[1]=1;
//
//        for(int i=2;i<dp.length;i++){
//
//            dp[i]= dp[i-1]+dp[i-2];
//        }
//        return dp[n];
//    }
//}
//public class TabulationApproach {
//
//}
