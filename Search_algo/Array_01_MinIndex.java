package Search_algo;

public class Array_01_MinIndex {
   
	public static int BinarySearch(int [] arr) {
		
		int low=0;
		int high=arr.length-1;
		
		int ans=-1;
		while(low<=high) {
			
			int mid= (low+high)/2;
			if(arr[mid]==1) {	
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
      int [] arr= {1,1,1,1,1};
      
       System.out.println(BinarySearch(arr));
       
	}

}
