package function_day2;

import java.util.Scanner;

public class pascal_triangle {

	public static void PascalPattern(int n) {
		
		
		int row=0;
		int nst=1;
		while(row<n) {
			
			// Print the Star	
			int i=0;
			int ncr=1;
			while(i<nst) {
				System.out.print(ncr+" ");
				ncr= (ncr*(row-i))/(i+1);
				i++;
			}	
			// Preparation for Next row
			nst=nst+1;
			row=row+1;
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		PascalPattern(n);
		
	}

}
