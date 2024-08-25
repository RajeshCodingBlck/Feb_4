//package DynamicProgramming;
//
//class Solution {
//
//    public int helper(int i,int j, String text1, String text2, int [] [] dp){
//
//  if(i >= text1.length() || j>= text2.length()){
//     return 0;
//  }
//
//    if(dp[i][j] !=-1){
//        return dp[i][j];
//    }
//
//    char ch1= text1.charAt(i);
//    char ch2= text2.charAt(j);
//
//    if(ch1==ch2){
//      
//      return dp[i][j]= 1+ helper(i+1, j+1, text1, text2, dp);
//    }else{
//     
//     int ans1= helper(i, j+1, text1, text2, dp);
//     int ans2= helper(i+1, j, text1, text2, dp);
//      
//      int mera_ans= Math.max(ans1,ans2);
//      return  dp[i][j]= mera_ans;
//    }
//
//    }
//    public int longestCommonSubsequence(String text1, String text2) {
//
//    int n= text1.length();
//    int m= text2.length();
//
//     int [][] dp= new int[n][m];
//
//      for(int i=0; i<n;i++){
//        Arrays.fill(dp[i], -1);
//      }
//      return  helper(0,0, text1, text2, dp);
//    }
//}
//public class LCS_inRecursion {
//
//}
