package Search_algo;

import java.util.Arrays;

public class Binary_Search {

	public static boolean BinarySearch(int [] arr, int target_value) {
		
	    Arrays.sort(arr);
	    
		int low= 0;
		int high= arr.length-1;
		
		while(low<=high) {
			
			int mid= (low+high)/2;
			if(arr[mid]==target_value) {
				return true;
			}else if(arr[mid]> target_value) {			
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,1,3,15,2,11};
	     int target_value=5;
	    
	     System.out.println(BinarySearch(arr, target_value));
	     
	     
	}

}
