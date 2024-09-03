//package DynamicProgramming;
//
//class Solution {
//    // Function to return max value that can be put in knapsack of capacity W.
//    
//    static int helper(int i, int W, int wt[], int val[], int [] []dp){
//        
//         if(i== wt.length){
//             return 0;
//         }
//         
//         if(dp[i][W] !=0){
//             return dp[i][W];
//         }
//        
//        // Not pick
//         int ans1=  0+ helper(i+1, W, wt, val, dp);
//         // Pick
//         if(W>= wt[i]){
//              int ans2= val[i]+ helper(i+1, W-wt[i], wt, val, dp);
//              return  dp[i][W]=Math.max(ans1, ans2);
//         }
//         return dp[i][W]=ans1;
//         
//    }
//    static int knapSack(int W, int wt[], int val[]) {
//        // your code here
//        
//        int [][] dp= new int[wt.length][W+1];
//        
//       return  helper(0,W, wt, val, dp);
//    }
//}
//public class Knapsack01 {
//
//}
