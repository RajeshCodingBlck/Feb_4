package Sorting_algo;

public class IsSorted {

	public static boolean isSorted(int [] arr) {
		
		for(int i=0; i<arr.length-1;i++) {
			
			if(arr[i]<=arr[i+1]) {
				continue;
			}else {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {1,2,1,3,4,5,6};
     
     System.out.println(isSorted(arr));
     
	}

}
