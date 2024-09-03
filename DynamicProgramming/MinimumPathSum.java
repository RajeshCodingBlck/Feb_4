//package DynamicProgramming;
//
//
//class Solution {
//    public int helper(int curr_r, int curr_c, int des_r, int des_c,
//                      int [][] grid, int [][]dp){
//      
//        if(curr_r== des_r && curr_c==des_c){ //+Ve Base
//            
//            return grid[curr_r][curr_c];
//        }
//        if(curr_r> des_r || curr_c >des_c){
//            return (int)(1e9);
//        }
//        
//        if(dp[curr_r][curr_c] !=-1){
//            return dp[curr_r][curr_c];
//        }
//        
//      // Right 
//     int ans1= helper(curr_r, curr_c+1, des_r, des_c, grid, dp);
//       // Down
//     int ans2= helper(curr_r+1, curr_c, des_r, des_c, grid, dp);
//        
//     int mera_ans= grid[curr_r][curr_c]+ Math.min(ans1, ans2);
//        return dp[curr_r][curr_c]=mera_ans;
//        
//    }
//    public int minPathSum(int[][] grid) {
//        
//        int row= grid.length;
//        int col= grid[0].length;
//        int [][] dp=new int[row][col];
//        
//        for(int i=0;i<row;i++){
//            for(int j=0; j<col;j++){
//                
//                dp[i][j]=-1;
//            }
//        }
//        
//        return helper(0,0, grid.length-1, grid[0].length-1, grid, dp);
//    }
//}
//public class MinimumPathSum {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
