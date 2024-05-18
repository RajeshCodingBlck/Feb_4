package Recursion;

public class PrintInDecreasing {
   
	public static void printDec(int n) {
		
//		Define :- Take n -> print Natural Number in Decreasing Order.
		if(n==0) {
			return ;
		}
		
		// Define the SubProblem
		System.out.println(n);
		printDec(n-1);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printDec(5);
	}

}
