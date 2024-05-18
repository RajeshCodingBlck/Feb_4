package Recursion;

import java.util.Scanner;

public class Print_Array {
   
	public static void PrintArray(int [] arr , int i) {
		
		if(i==arr.length) {
			return;
		}
	
	   // Define SubProblem
		System.out.print(arr[i]+" ");
		PrintArray(arr,i+1);
		
	}
	
	public static void PrintArrayMethod2(int [] arr, int n) {
		
		  if(n==0){
			  return;
		  }

		  PrintArrayMethod2(arr, n-1);
		 System.out.print(arr[n-1]+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] arr= {1,2,3,4,5};
//		Scanner s= new Scanner(System.in);
//		int n= s.nextInt();
//		
//		int [] arr= new int[n];
//		
//		for(int i=0; i<arr.length;i++) {
//			arr[i]=s.nextInt();
//		}
//		  PrintArray(arr, 0);
//         System.out.println(arr.length);
		 PrintArrayMethod2(arr, arr.length);
		
		
	}

}
