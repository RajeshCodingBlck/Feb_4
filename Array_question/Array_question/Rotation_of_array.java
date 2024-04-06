package Array_question;

//https://leetcode.com/submissions/detail/1218011353/
public class Rotation_of_array {
	class Solution {
	    public void reverse_in_range(int [] arr, int s, int e){
	        
	        int i=s;
	        int j=e;
	        
	        while(i<=j){
	            
	            int temp=arr[i];
	            arr[i]=arr[j];
	            arr[j]=temp;
	            
	            i++;
	            j--;
	        }
	        
	        
	    }
	    public void rotate(int[] nums, int k) {
	        
	      k= k% nums.length;
	        
	      reverse_in_range(nums, 0, nums.length-1);
	      reverse_in_range(nums, 0, k-1);
	      reverse_in_range(nums, k, nums.length-1);
	        
	      
	        
	    }
	}
}
