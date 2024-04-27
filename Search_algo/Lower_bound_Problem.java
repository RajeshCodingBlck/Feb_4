package Search_algo;

public class Lower_bound_Problem {
   
	public static int Lower_bound(int [] arr, int target) {
		
		
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		
		while(low<=high) {
			
			int mid= (low+high)/2;
			
//			if(arr[mid]==target) {
//				ans=mid;
//				high=mid-1;
//			}else if(arr[mid]> target) {
//				high=mid-1;
//				
//			}else {
//				low=mid+1;
//			}
			
			
			if(arr[mid]>=target) {
				ans=mid;
				high=mid-1;
			}else {
				low=mid+1;
			}
			
		}
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] ans= {1,2,2,4,5,5,6,7};
       System.out.println(Lower_bound(ans,3));
       
       
	}

}
