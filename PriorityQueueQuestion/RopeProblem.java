//
//package PriorityQueueQuestion;
//
//class Solution
//{
//    //Function to return the minimum cost of connecting the ropes.
//    long minCost(long arr[], int n) 
//    {
//        
//        long ans=0;
//        PriorityQueue<Long> pq= new PriorityQueue();
//        
//        for(int i=0;i<arr.length;i++){
//            pq.add(arr[i]);
//        }
//        
//        while(pq.size()>1){
//            
//            long min1= pq.remove();
//            long min2=pq.remove();
//            
//            long currCost=min1+min2;
//            ans+=currCost;
//            pq.add(currCost);
//        }
//        return ans;
//    }
//}
//public class RopeProblem {
//
//}
