package Array_question;

//https://leetcode.com/submissions/detail/1225612749/
public class Product_2_method_2 {
	class Solution {
	    public int[] productExceptSelf(int[] nums) {
	        
	      int n= nums.length;
	      int [] left= new int[n];
	      
	      left[0]=1;
	        
	      for(int i=1; i<n;i++){
	          
	          left[i]=left[i-1]*nums[i-1];
	      }
	       
	      int [] right= new int [n];
	        
	        right[n-1]=1;
	        
	        for(int i=n-2; i>=0;i--){
	            
	            right[i]=right[i+1]*nums[i+1];
	        }
	        
	        int [] final_ans= new int [n];
	        
	        for(int i=0; i<n;i++){
	            
	            final_ans[i]= left[i]*right[i];
	        }
	        
	        return final_ans;
	        
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
