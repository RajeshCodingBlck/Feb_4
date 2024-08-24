//class Solution {
//
//  // No of ways to reach the oth from nth Stair
//    public int helper(int n, int [] dp){
//
//       if(n==0){
//         return 1;
//       }
//       if(n<0){
//        return 0;
//       }
//        
//        if(dp[n] !=0){
//            return dp[n];
//        }
//
//     // 1 ka jump
//       int chhota_ans1 = helper(n-1, dp);
//       // 2 ka jump
//       int chhota_ans2 = helper(n-2, dp);
//       int mera_ans= chhota_ans1+ chhota_ans2;
//       return dp[n]= mera_ans;
//    }
//    public int climbStairs(int n) {
//        
//        int [] dp= new int[n+1];
//        return helper(n, dp);
//    }
//}