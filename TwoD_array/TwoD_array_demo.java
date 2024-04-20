package TwoD_array;

import java.util.Scanner;

public class TwoD_array_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [][] arr= new int [3][4];
     
//     System.out.println(arr);
//     
//     System.out.println(arr[0][3]);
//     arr[0][3]=10;
//     System.out.println(arr[0][3]);
     
     int [] [] brr= arr;
    // int [][] arr= new int [][4]; Error We must have to provide No of rows
     
     
     Scanner s= new Scanner(System.in);
     // Input
     
     // for row
     for(int i=0; i<3; i++) {
    	 
    	 // for col
    	 for(int j=0; j<4;j++) {
    		 
    		 arr[i][j]= s.nextInt();
    	 }
    	 
     }
     
     
     
     
	}

}
