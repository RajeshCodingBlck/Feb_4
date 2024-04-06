package Array_question;

import java.util.Scanner;

public class Searching_in_array {

	public static boolean Search(int [] arr, int target) {
		
		int size= arr.length;
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]==target) {
				 return true;
			}
		}
		 return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       
       // Size of Array
       int n= s.nextInt();
       int [] arr= new int[n]; // Create Array of N size length
       for(int i=0; i<n;i++) {
    	   
    	   arr[i]=s.nextInt(); // take input in each block of array
       }
       
       int target= s.nextInt(); // Take input of target
       System.out.println(Search(arr, target));
       
       
       
     
	}

}
