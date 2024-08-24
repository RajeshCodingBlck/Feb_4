//package DynamicProgramming;
//
//class Solution {
//    public int climbStairs(int n) {
//        
//    // dp[i] => no of ways to reach 0th Stair from ith Stair. 
//        int [] dp= new int[3];
//        dp[0]=1;
//        dp[1]=1;
//
//        for(int i=2;i<=n;i++){
//
//            dp[2]= dp[0]+dp[1];
//
//            dp[0]=dp[1];
//            dp[1]=dp[2];
//        }
//        return dp[1];
//    }
//}
//public class MostOptimizedWay {
//
//}
