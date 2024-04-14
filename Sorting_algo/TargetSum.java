package Sorting_algo;

import java.util.*;

public class TargetSum {

	public static boolean PairSum(int [] arr, int target) {
		
		 Arrays.sort(arr);
		 
		 int i=0;
		 int j= arr.length-1;
		 
		 while(i<j) {
			 
			 int sum= arr[i]+arr[j]; 
			 if(sum==target) {
				 return true;
			 }else if(sum< target) {
				 i++;
			 }else {
				 j--;
			 }
		 }
		 
		 return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,4,2,5,7};
      
        System.out.println(PairSum(arr, 10));
        
//      for(int i=0; i<arr.length;i++) {
//    	  
//    	  System.out.print(arr[i]+" ");
//      }
      
      
      
      
	}

}
