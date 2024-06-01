package Recursion_4;

import java.util.ArrayList;

public class Subsequence_inArray {
    
	public static void print(int [] arr, int i,
			ArrayList<Integer> ans, int k) {
		
		if(i==arr.length) {
			
			int currsum=0;
			for(Integer val : ans) {
				currsum+=val;
			}
			if(currsum !=k) {
				return ;
			}
			System.out.println(ans);
			return ;
		}
		// Include ith value
		ans.add(arr[i]);
		print(arr, i+1, ans,k);
		ans.remove(ans.size()-1);
		// Not Include
		print(arr, i+1, ans,k);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,4};
      int k=5;
      ArrayList<Integer> ans=new ArrayList();
      
      print(arr, 0, ans,k);
	}

}
