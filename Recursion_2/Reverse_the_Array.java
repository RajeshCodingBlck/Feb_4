package Recursion_2;

public class Reverse_the_Array {
    
	public static void reverse(int [] arr, int i, int j) {
		
		  if(i>=j) {
			  return ;
		  }
		
		 reverse(arr, i+1, j-1);		 
		 // Swap
		 int temp=arr[i];
		 arr[i]=arr[j];
		 arr[j]=temp;
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,3,4,5,6,7};
   
       
       reverse(arr, 0, arr.length-1);
       
       // Print the Array
       for(int i=0;i<arr.length;i++) {
    	   System.out.print(arr[i]+" ");
       }
       
	}

}
