package Sorting_algo;

public class Selection_sort {
    
	public static int MinIndex(int [] arr, int s, int e) {
		
		int index=s;
		int min_val=arr[s];
		
		for(int i=s+1; i<=e;i++) {
			
			if(min_val> arr[i]) {
				min_val=arr[i];
				index=i;
			}
		}
		
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {3,2,1,-10,20,-30,20};
//     System.out.println(MinIndex(arr,1,4));
     
     
      for(int i=0; i<arr.length;i++) {
    	  
    	 int min_index=MinIndex(arr,i, arr.length-1);
    	 
    	 int temp= arr[min_index];
    	 arr[min_index]= arr[i];
    	 arr[i]=temp;
    	 
      }
      
      for(int i=0; i<arr.length;i++) {
    	  System.out.print(arr[i]+" ");
      }
     
	}

}
