package Array_question;
import java.util.*;
public class Subarray_of_array {
    
	public static void cutPrint(int [] arr, int s, int e) {
		
	
		for(int i=s; i<=e;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
	public static int SumSubarray(int [] arr, int s, int e) {
		
		int sum=0;
		
		for(int i=s; i<=e;i++) {
			sum+=arr[i];
		}
		
		return sum;
	}
	public static void Subarray(int [] arr) {
		
	// int overall_max_sum= Integer.MIN_VALUE;
	for(int s= 0; s<arr.length;s++) {
			
		for(int e=s; e< arr.length;e++) {
				
				
	    System.out.println("cut is from "+ s+ " "+e);
	    //cutPrint(arr, s, e);
	   int sum= SumSubarray(arr, s, e);
	   overall_max_sum= Math.max(overall_max_sum, sum);
	   
	    System.out.println(sum);
	    
		  }
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 
	 
     int [] arr= {1,2,4,5,2,3};
     Subarray(arr);
     //cutPrint(arr, 1,3);
     
     
     
	}

}
