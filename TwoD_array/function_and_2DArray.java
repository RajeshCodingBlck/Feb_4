package TwoD_array;

import java.util.Scanner;

public class function_and_2DArray {
    
	public static void Print(int [] [] arr) {
		
		int n= arr.length; // No of Rows
		int m= arr[0].length; // No of Columns
		
		for(int i=0; i<n;i++) {
			for(int j=0; j<m;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();// n represent No of Rows
		int m= s.nextInt();// m represent no of Columns
		
		int [] [] arr= new int[n][m];
		
		// Input
		for(int i=0; i<n;i++) {
			for(int j=0; j<m;j++) {
				
				arr[i][j]= s.nextInt();
			}
		}
		
		Print(arr);
		
		
	}

}
