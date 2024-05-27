package Recursion_3;

public class Combination_withoutReturn {
   
	public static void PrintCombination(int n, String ans) {
		
		if(n==0) {
			System.out.println(ans);
			return ;
		}
		
		PrintCombination(n-1, "H"+ans);
		PrintCombination(n-1, "T"+ans);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=3;
         
         PrintCombination(n, "");
         
	}

}
