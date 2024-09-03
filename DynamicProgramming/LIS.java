//package DynamicProgramming;
//
//class Solution {
//    public int lengthOfLIS(int[] nums) {
//        
//        int n= nums.length;
//        int [] dp= new int[n];
//        
//        dp[0]=1;
//        int overallMax=1;
//        
//        for(int i=1; i<n;i++){    
//            int currIans=1;   
//            for(int j=i-1;j>=0;j--){    
//                if(nums[j]< nums[i]){                 
//                    currIans= Math.max(currIans, dp[j]+1);
//                }
//            }  
//            dp[i]= currIans;
//            overallMax= Math.max(dp[i], overallMax);
//            
//        }
//        return overallMax;
//    }
//    
//}
//public class LIS {
//
//}
