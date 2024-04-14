package Sorting_algo;

import java.util.Scanner;

public class TargetSumCheck {
   
	public static boolean TargetSum(int [] arr, int target) {
		
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length;j++) {	
			  int sum= arr[i]+arr[j];
				if(sum==target) {	
					return true;
				}
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       int size= s.nextInt();
       int [] arr= new int[size];
       
       for(int i=0; i<size;i++) {
    	   arr[i]=s.nextInt();
       }
      
       System.out.println(TargetSum(arr, 160));
	}

}
