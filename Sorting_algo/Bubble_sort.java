package Sorting_algo;

public class Bubble_sort {

	public static void Bubble(int [] arr) {
		
		for(int round=1; round<arr.length;round++) {
			
			for(int i=0; i<arr.length-round;i++) {	
				if(arr[i]> arr[i+1]) {	
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	  int [] arr= {5,4,3,2,1};
	  Bubble(arr);
	  
	  for(int i=0; i<arr.length;i++) {
		  System.out.print(arr[i]+" ");
	  }
	  
	  
		
	}

}
