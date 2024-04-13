package Array_question;

import java.util.*;

public class Running_Max {

	public static int [] Running_max(int [] arr) {
		
		int [] run_max= new int[arr.length];
		
		run_max[0]=arr[0];
		
		for(int i=1; i<arr.length;i++) {
			
			run_max[i]= Math.max(run_max[i-1], arr[i]);
		}
		
		return run_max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      
      int n= s.nextInt();
      int [] arr= new int[n];
      // Input 
      for(int i=0; i<n;i++) {
    	  arr[i]=s.nextInt();
      }
      
      int [] run_max= Running_max(arr);
      
      // Print 
      for(int i=0; i<run_max.length;i++) {
    	  
    	  System.out.print(run_max[i]+" ");
      }
      
      
	}

}
