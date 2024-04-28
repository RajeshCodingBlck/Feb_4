package Binary_Search_2;

public class Upper_bound {

	public static int upper_bound(int [] arr, int target) {
		
		
		int low=0;
		int high=arr.length-1;
		
		int ans=-1;
		while(low<=high) {
			
			int mid= (low+high)/2;
			
			if(arr[mid]==target) {
				ans= mid;
				low=mid+1;
			}else if(arr[mid]> target) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,1,2,2,3,3,3,3,4,5,5}; 
       int target=3;
       System.out.println(upper_bound(arr, target));
       
       
       
	}

}
