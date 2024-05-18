package Recursion;

public class PrintInIncreasingOrder {
   
	public static void printIncreasing(int n) {
		
		if(n==0) {
			return ;
		}
		
		printIncreasing(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 printIncreasing(6);
	}

}
