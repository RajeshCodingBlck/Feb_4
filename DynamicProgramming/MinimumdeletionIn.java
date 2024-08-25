//package DynamicProgramming;
//
//class Solution {
//    public int helper(int i, int j, String word1, String word2){
//
//      if(i>= word1.length()){
//          return word2.length()-j;
//      }
//
//      if(j>= word2.length()){
//        return  word1.length()-i;
//      }
//
//        char ch1= word1.charAt(i);
//        char ch2= word2.charAt(j);
//
//        if(ch1==ch2){
//
//              return helper(i+1, j+1, word1, word2);
//        }else{
//          
//          int ans1= helper(i, j+1, word1, word2);
//          int ans2= helper(i+1, j, word1, word2);
//
//          return 1+ Math.min(ans1, ans2);
//
//
//        }
//    }
//    public int minDistance(String word1, String word2) {
//        
//
//        return helper(0,0, word1, word2);
//    }
//}
//public class MinimumdeletionIn {
//
//}
