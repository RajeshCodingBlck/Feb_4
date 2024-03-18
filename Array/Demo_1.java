package Array;

import java.util.Scanner;

public class Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int  [] arr = new int[n] ;
		int [] brr=arr;
		
//		arr[1]=250;
//		System.out.println(arr[3]);
		
		
		// Input
		for(int i=0; i<5;i++) {
			
			arr[i]= s.nextInt();
			
		}
		
		// for Print
		for(int i=0; i<5;i++) {
			
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
