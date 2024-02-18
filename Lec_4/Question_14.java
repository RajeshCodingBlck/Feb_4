package Lec_4;

import java.util.Scanner;

public class Question_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		
		int row=1;
		int nsp=n-1;
		int nst=1;
		while(row<=2*n-1) {
			
			// Print the Space
			int j=1;
			while(j<=nsp) {
				System.out.print(" "+" ");
				j=j+1;
			}
			
			// Print the Star
			int i=1;
			while(i<=nst) {
				System.out.print("*"+" ");
				i=i+1;
			}
			// Preparation for Next Row
			//nst=nst+1;
			if(row<n) {
				nst=nst+1;
				nsp=nsp-1;
			}else {
				nst=nst-1;
				nsp=nsp+1;
			}
			
			System.out.println();
			row=row+1;
			
		}
		
	}

}
