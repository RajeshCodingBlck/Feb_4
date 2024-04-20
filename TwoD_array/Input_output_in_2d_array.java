package TwoD_array;

import java.util.*;

public class Input_output_in_2d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s= new Scanner(System.in);
		
		int row= s.nextInt(); // No of  row
		int col= s.nextInt();
		
		int [][] arr= new int[row][col];
		
		// Input
		for(int i=0;i<row;i++) {
			for(int j=0; j<col;j++) {	
				arr[i][j]= s.nextInt();
			}
		}
		
		// Print 
		for(int i=0; i<row;i++) {
			for(int j=0; j<col; j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
	}

}
