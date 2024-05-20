package Recursion_2;

public class BinarySearchUsingRecursion {
    
	public static boolean BS(int [] arr, int low, int high, int target) {
		
		 if(low>high) {
			 
			 return false;
		 }

		int mid= (low+high)/2;
		
		if(arr[mid]==target) {
			return true;
		}else if(arr[mid]<target) {
			
		return 	BS(arr, mid+1, high, target);
		}else {
			
		 return	BS(arr, low, mid-1, target);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
