package Sorting_algo;

public class Partial_sorted_array {
    
	public static void Insert(int [] arr, int i, int temp) {
		
		
		while(i>=0 && arr[i]> temp) {
			
			arr[i+1]=arr[i];
			i--;
		}
		
		arr[i+1]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {5,10,13,14,17,7};
     Insert(arr, arr.length-2, arr[arr.length-1]);
     
      for(int i=0; i<arr.length;i++) {
    	  
    	  System.out.print(arr[i]+" ");
      }
	}

}
