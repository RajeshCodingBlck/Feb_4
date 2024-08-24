//package DynamicProgramming;
//
//
//class Solution {
//
//    public int helper(int curr_r, int curr_c, int des_r, int des_c, int [][] dp){
//
//       if(curr_r==des_r && curr_c==des_c){
//          return 1;
//       }
//
//       if(curr_r> des_r || curr_c>des_c){
//        return 0;
//       }
//
//       if(dp[curr_r][curr_c] !=0){
//        return dp[curr_r][curr_c];
//       }
//
//        // Right
//       int ans1= helper(curr_r, curr_c+1, des_r, des_c, dp);
//        // Down
//       int ans2= helper(curr_r+1, curr_c, des_r, des_c, dp);
//
//       int mera_ans= ans1+ans2;
//       return  dp[curr_r][curr_c]= mera_ans;
//    }
//    public int uniquePaths(int m, int n) {
//
//      int [][] dp= new int [m][n];  
//        return helper(0,0,m-1, n-1, dp);
//    }
//}
//public class UniquePath {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
